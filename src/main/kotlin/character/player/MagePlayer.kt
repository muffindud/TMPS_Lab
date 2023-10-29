package character.player

import item.equipment.armor.Armor
import item.equipment.backpack.Backpack
import item.equipment.weapon.MagicWeapon
import item.equipment.weapon.AWeapon

class MagePlayer(
    override var playerName: String,
    override var xPosition: Int,
    override var yPosition: Int,
    armor: Armor,
    backpack: Backpack,
    weapon: AWeapon
    ): APlayer(armor, backpack, weapon)
{
    override fun clone(source: APlayer): MagePlayer {
        return MagePlayer(
            source.playerName,
            source.xPosition,
            source.yPosition,
            source.armor,
            source.backpack,
            source.weapon as MagicWeapon
        )
    }
}