package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.backpack.Backpack
import item.equipment.weapon.PhysicalWeapon
import item.equipment.weapon.Weapon

class WarriorPlayer
    (
        override var playerName: String,
        override var xPosition: Int,
        override var yPosition: Int,
        armor: Armor,
        backpack: Backpack,
        weapon: Weapon
    ): Player(armor, backpack, weapon)
{
    override fun clone(source: Player): WarriorPlayer {
        return WarriorPlayer(
            source.playerName,
            source.xPosition,
            source.yPosition,
            source.armor,
            source.backpack,
            source.weapon as PhysicalWeapon
        )
    }
}