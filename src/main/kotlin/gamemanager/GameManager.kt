package gamemanager

import creationals.builders.armorbuilders.*
import creationals.builders.backpackbuilders.*
import creationals.builders.weaponbuilder.*

class GameManager
{
    var endGame: Boolean = false

    val basicArmorBuilder: ArmorBuilder = BasicArmorBuilder()
    val basicBackpackBuilder: BackpackBuilder = BasicBackpackBuilder()
    val basicWeaponBuilder: WeaponBuilder = BasicSwordBuilder()
    val basicCatalystBuilder: WeaponBuilder = BasicCatalystBuilder()

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