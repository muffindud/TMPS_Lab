package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.weapon.Weapon

abstract class Player (): Character {
    override val healthPoints: Int = 200
    abstract val playerName: String
    abstract val armor: Armor
    abstract val weapon: Weapon
}