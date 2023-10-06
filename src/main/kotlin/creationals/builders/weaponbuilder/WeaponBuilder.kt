package creationals.builders.weaponbuilder

import item.equipment.weapon.PhysicalWeapon
import item.equipment.weapon.Weapon

interface WeaponBuilder
{
    var attackDamage: Int
    var weight: Int

    fun build(): Weapon
}