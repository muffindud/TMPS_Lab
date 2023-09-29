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
    
    // Run at the start of the game
    fun startGame()
    {
        var armor: Armor = BasicArmor()
        var backpack: Backpack = BasicBackpack()
        var sword: PhysicalWeapon = BasicSword()
        var player: Player = WarriorPlayer("Joe", 0, 0, armor, backpack, sword)
    }
    
    // Run every frame
    fun updateGame()
    {
        
    }
}