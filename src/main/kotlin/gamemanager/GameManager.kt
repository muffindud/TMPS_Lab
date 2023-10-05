package gamemanager

import character.*
import character.player.*
import character.player.WarriorPlayer
import item.*
import item.equipment.armor.*
import item.equipment.backpack.*
import item.equipment.backpack.backpacks.*
import item.equipment.armor.armors.BasicArmor
import item.equipment.weapon.PhysicalWeapon
import item.equipment.weapon.physicalweapons.BasicSword

class GameManager
{
    var endGame: Boolean = false

    // Singleton
    private val instance: GameManager? = null

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