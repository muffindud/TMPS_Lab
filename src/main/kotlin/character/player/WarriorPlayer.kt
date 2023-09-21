package character.player

import character.Character
import item.equipment.armor.Armor
import item.equipment.armor.armors.*
import item.equipment.weapon.PhysicalWeapon
import item.equipment.weapon.physicalweapons.*

class WarriorPlayer(override var playerName: String, override var xPosition: Int, override var yPosition: Int): Player() {
    override var weapon: PhysicalWeapon = BasicSword()

    override fun attack (target: Character) {
        TODO()
    }
}