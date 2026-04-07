fun appExplanation() {
    println("Welcome to my StoryCrafting CRUD! \n" +
            "In here you can create sessions and write dialogue-based stories. \n" +
            "Data is not persistent so please be careful!\n" +
            "You can start by pressing 1 to go to sessions and create a story ◝(ᵔᗜᵔ)◜")
}

fun crudUi() {
    println("\nStoryCrafting CRUD")
    println("1. Go to sessions")
    println("2. About this CRUD")
    println("3. Create a backstory")
    println("4. Show backstory~")
    println("0. Exit")
}

fun sessionUi(sessions: MutableList<StorySession>) {
    println("\nSessions:")
    if (sessions.isEmpty()) println("No sessions yet")

    println("1. Show your sessionS~")
    println("2. Create a session~")
    println("3. Delete a session~")
    println("4. Enter a session~")
    println("5. Edit session name~")
    println("6. Back to homepage~")
    println("0. Exit")
}

fun chatUi(chats: MutableList<Chat>, sessionId: Int) {
    val filtered = chats.filter { it.sessionId == sessionId }

    println("\nChat (Session $sessionId)")
    if (filtered.isEmpty()) println("No chats yet, try adding some~")
    else filtered.forEach {
        val actionText = it.action?.let { act -> "*$act* " } ?: ""
        println("[${it.id}] [${it.character}] $actionText ${it.dialogue}")
    }

    println("\n")
    println("1. Create a chat~")
    println("2. Edit a chat~")
    println("3. Delete a chat~")
    println("4. Back to sessions~")
    println("0. Exit")
}