package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.PhysicalWeapon
import item.equipment.weapon.physicalweapons.*

class WarriorPlayer(override val playerName: String, override val xPosition: Int, override val yPosition: Int): Player() {
    override val weapon: PhysicalWeapon = BasicSword()

    override fun attack (target: Character) {
        TODO()
    }
}