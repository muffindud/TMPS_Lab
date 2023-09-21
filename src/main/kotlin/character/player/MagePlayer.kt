package character.player

import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.MagicWeapon
import item.equipment.weapon.magicweapons.*

class MagePlayer (override val playerName: String, override val xPosition: Int, override val yPosition: Int): Player() {
    override val weapon: MagicWeapon = BasicCatalyst()
}