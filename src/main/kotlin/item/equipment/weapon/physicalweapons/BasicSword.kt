package item.equipment.weapon.physicalweapons

import item.equipment.weapon.PhysicalWeapon

final class BasicSword: PhysicalWeapon() {
    override var attackDamage: Int = 15
    override val weight: Int = 10
}