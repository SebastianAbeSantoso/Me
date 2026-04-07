import java.time.LocalDateTime

data class StorySession(
    val title: String,
    val id: Int,
    val created: LocalDateTime,
)

data class Chat(
    val id: Int,
    val sessionId: Int,
    val action: String? = null,
    val character: String,
    val dialogue: String,
    val timestamp: LocalDateTime
)