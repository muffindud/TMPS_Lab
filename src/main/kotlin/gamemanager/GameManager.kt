package gamemanager

import creationalclasses.*
import creationals.factories.*

class GameManager
{
    var endGame: Boolean = false

    // Singleton
    companion object
    {
        private val instance: GameManager? = null
    }

    fun getInstance(): GameManager
    {
        return instance ?: GameManager()
    }

    init {
        startGame()
    }

    // Builders
    val builders: Builders = Builders().getInstance()

    // Prototypes
    val prototypes: Prototypes = Prototypes().getInstance()

    // Factories
    val factories: MonsterFactory = MonsterFactory().getInstance()

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