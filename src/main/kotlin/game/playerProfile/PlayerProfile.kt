package game.playerProfile

import java.io.File
import java.io.FileWriter
import java.util.Scanner

class PlayerProfile {
    var playerId: String = ""
    var playerName: String = ""
    var playerEmail: String = ""

    constructor(
        playerId: String,
        playerName: String,
        playerEmail: String
    ) {
        this.playerId = playerId
        this.playerName = playerName
        this.playerEmail = playerEmail

        this.saveProfile()
    }

    constructor(
        playerFileName: String
    ) {
        val playerFileReader = Scanner(File(playerFileName))

        this.playerId = playerFileReader.nextLine()
        this.playerName = playerFileReader.nextLine()
        this.playerEmail = playerFileReader.nextLine()
    }

    fun saveProfile () {
        val playerFile = File("./players/" + this.playerName + ".txt")
        playerFile.createNewFile()

        val playerFileWriter = FileWriter("./players/" + this.playerName + ".txt")
        playerFileWriter.write(this.playerId + "\n" + this.playerName + "\n" + this.playerEmail)
    }

    fun changeName (newName: String) {
        playerName = newName
        this.saveProfile()
    }

    fun changeEmail (newEmail: String) {
        playerEmail = newEmail
        this.saveProfile()
    }
}