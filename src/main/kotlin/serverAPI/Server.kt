package serverAPI

class Server private constructor() {
    val hostname: String = ""

    companion object {
        val instance: Server? = null
        fun getInstance(): Server {
            return instance ?: Server()
        }
    }

    fun getPlayerData (playerId: String): String {
        // Make request to server
        // Return player data

        return ""
    }
}