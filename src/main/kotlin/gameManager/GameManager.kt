package gameManager

import patterns.creationals.creationalClasses.*
import patterns.creationals.factories.*
import game.ui.*
import patterns.structurals.facade.UI

class GameManager private constructor()
{
    var endGame: Boolean = false

    // Singleton
    companion object
    {
        private val instance: GameManager? = null
        fun getInstance(): GameManager
        {
            return instance ?: GameManager()
        }
    }

    init {
        startGame()
    }

    // Builders
    val builders: Builders = Builders.getInstance()

    // Prototypes
    val prototypes: Prototypes = Prototypes.getInstance()

    // Factories
    val factories: MonsterFactory = MonsterFactory.getInstance()

    val ui: UI = UI(
        Menu,
        MapWindow,
        InventoryWindow,
        Toolbar
    )

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