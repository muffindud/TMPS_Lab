package game.character.player

import game.item.equipment.armor.Armor
import game.item.equipment.backpack.Backpack
import game.item.equipment.weapon.PhysicalWeapon
import game.item.equipment.weapon.AWeapon

class WarriorPlayer
    (
        override var playerName: String,
        override var xPosition: Int,
        override var yPosition: Int,
        armor: Armor,
        backpack: Backpack,
        weapon: AWeapon
    ): APlayer(armor, backpack, weapon)
{
    override fun clone(source: APlayer): WarriorPlayer {
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