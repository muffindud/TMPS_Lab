package gameManager

import serverAPI.Server

object GameManager {
    var isGameRunning = false

    var server: Server = Server()

    fun startGame() {
        isGameRunning = true
        updateGame()

        // Add start game routines here
    }

    fun updateGame() {
        // Add update game routines here

        if (isGameRunning) {
            updateGame()
        }
        else {
            endGame()
        }
    }

    fun endGame() {
        // Add end game routines here
    }
}