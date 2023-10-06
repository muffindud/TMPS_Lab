package gamemanager

import creationalclasses.*

class GameManager private constructor()
{
    var endGame: Boolean = false

    // Singleton
    companion object
    {
        private val instance: GameManager? = null
    }

    init {
        startGame()
    }

    // Builders
    val builders: Builders = Builders().getInstance()

    // Prototypes
    val prototypes: Prototypes = Prototypes().getInstance()

    fun getInstance(): GameManager
    {
        return instance ?: GameManager()
    }

    // Run at the start of the game
    private fun startGame()
    {
        //

        while (!endGame)
        {
            updateGame()
        }
    }
    
    // Run every frame
    private fun updateGame()
    {
        //
    }
}