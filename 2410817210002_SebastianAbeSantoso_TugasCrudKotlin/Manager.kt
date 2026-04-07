import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.exitProcess

enum class AppState {
    CRUD, SESSION, CHAT
}

class StoryManager(){
    val nextSessionId = AtomicInteger(0)
    val nextChatId = AtomicInteger(0)
    
    var state: AppState = AppState.CRUD
    var currentSessionId: Int? = null

    val sessionHistory = mutableListOf<StorySession>()
    val chatHistory = mutableListOf<Chat>()

    val invalidInput = "Invalid option~ please try again \"( – ⌓ – )"

    fun run(){
    while (true) {
        when (state) {
            AppState.CRUD -> {
                crudUi()

                val answer = readln().toIntOrNull() ?: -1

                crudUiLogic(answer)
            }

            AppState.SESSION -> {
                sessionUi(sessionHistory)

                val answer = readln().toIntOrNull() ?: -1

                sessionUiLogic(answer, sessionHistory, chatHistory)
            }

            AppState.CHAT -> {
                val sessionId = currentSessionId

                if (sessionId == null) {
                    state = AppState.SESSION
                    continue
                }

                chatUi(chatHistory, sessionId)
                val answer = readln().toIntOrNull()
                if (answer != null) chatUiLogic(answer, chatHistory, sessionId)
                else println(invalidInput)
                }
            }
        }
    }

    fun crudUiLogic(answer: Int) {
        when (answer) {
            1 -> state = AppState.SESSION
            2 -> appExplanation()
            0 -> exitProcess(0)
            else -> println(invalidInput)
        }
    }

    fun sessionUiLogic(answer: Int, sessions: MutableList<StorySession>, chats: MutableList<Chat>) {
        when (answer) {
            1 -> createSession(sessions)
            2 -> deleteSession(sessions, chats)
            3 -> enterSession(sessions)
            4 -> editSession(sessions)
            5 -> state = AppState.CRUD
            0 -> exitProcess(0)
            else -> println(invalidInput)
        }
    }

    fun chatUiLogic(answer: Int, chats: MutableList<Chat>, sessionId: Int) {
        when (answer) {
            1 -> createChat(chats, sessionId)
            2 -> editChat(chats, sessionId)
            3 -> deleteChat(chats, sessionId)
            4 -> {
                currentSessionId = null
                state = AppState.SESSION
            }
            0 -> exitProcess(0)
            else -> println(invalidInput)
        }
    }

    fun createSession(session: MutableList<StorySession>) {
        println("Title of your story:")
        val title = readln()

        session.add(StorySession(title, nextSessionId.getAndIncrement(), LocalDateTime.now()))
    }

    fun deleteSession(sessions: MutableList<StorySession>, chats: MutableList<Chat>) {
        println("Session ID:")
        val id = readln().toIntOrNull() ?: return

        sessions.removeIf {it.id == id}
        chats.removeIf {it.sessionId == id}
    }

    fun enterSession(sessions: MutableList<StorySession>) {
        println("Session ID:")
        val id = readln().toIntOrNull() ?: return

        val session = sessions.find {it.id == id}

        if (session != null) {
            currentSessionId = id
            state = AppState.CHAT
        } else {
            println("Session not found~ please enter a correct ID")
        }
    }

    fun createChat(chat: MutableList<Chat>, sessionId: Int) {
        println("Character:")
        val character = readln()

        println("Action (optional):")
        val action = readln().takeIf {it.isNotBlank() }

        println("Dialogue:")
        val dialogue = readln()

        chat.add(
            Chat(
                nextChatId.getAndIncrement(),
                sessionId,
                action,
                character,
                dialogue,
                LocalDateTime.now()
            )
        ).also {println("\nDialogue created for $character") }
    }

    fun editChat(chats: MutableList<Chat>, sessionId: Int) {
        println("Chat ID:")
        val id = readln().toIntOrNull() ?: return

        val index = chats.indexOfFirst { it.id == id && it.sessionId == sessionId }
        if (index < 0) return

        val old = chats[index]

        println("New action (optional):")
        val newAction = readln().ifBlank {old.action }
        println("New dialogue:")
        val newDialogue = readln().ifBlank {old.dialogue }

        chats[index] = old.copy(
            action = newAction,
            dialogue = newDialogue,
            timestamp = LocalDateTime.now()
        ).also {println("\nChat updated for ${old.character}")}
    }

    fun deleteChat(chats: MutableList<Chat>, sessionId: Int) {
        println("Chat ID:")
        val id = readln().toIntOrNull() ?: return

        val removed = chats.removeIf { it.id == id && it.sessionId == sessionId }

        if (removed) println("Chat removed~")
        else println("Chat not found, please enter a correct Chat ID~")
    }

    fun editSession(sessions: MutableList<StorySession>) {
        println("Session ID:")
        val id = readln().toIntOrNull() ?: return

        val index = sessions.indexOfFirst {it.id == id}

        if (index == -1) {
            println("Id not found~ please enter a correct session ID")
            return
        }

        val old = sessions[index]

        println("New title:")
        val newTitle = readln().ifBlank {old.title}

        if (newTitle == old.title) {
            println("No changes made~")
        } else {
            sessions[index] = old.copy(title = newTitle)
            println("\nSession name has been edited to $newTitle~")
        }
    }
}
