package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.Weapon
import item.equipment.backpack.Backpack
import item.equipment.backpack.backpacks.*

abstract class Player (): Character {
    override val healthPoints: Int = 200
    abstract val playerName: String
    val armor: Armor = BasicArmor()
    abstract val weapon: Weapon
    val backpack: Backpack = BasicBackpack()
}