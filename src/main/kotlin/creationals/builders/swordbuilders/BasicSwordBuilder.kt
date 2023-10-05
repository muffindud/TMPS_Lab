package creationals.builders.swordbuilders

import item.equipment.weapon.PhysicalWeapon

class BasicSwordBuilder: WeaponBuilder {
    override var attackDamage: Int = 15
    override var weight: Int = 10

    fun build(): PhysicalWeapon {
        return PhysicalWeapon(attackDamage, weight)
    }
}