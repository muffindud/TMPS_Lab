package creationals.builders.swordbuilders

import item.equipment.weapon.MagicWeapon

class BasicCatalystBuilder: WeaponBuilder {
    override var attackDamage: Int = 10
    override var weight: Int = 5

    fun build(): MagicWeapon {
        return MagicWeapon(attackDamage, weight)
    }
}