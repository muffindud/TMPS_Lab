package creationals.builders.weaponbuilder.physicalweapons

import creationals.builders.weaponbuilder.WeaponBuilder
import item.equipment.weapon.*

abstract class PhysicalWeaponBuilder: WeaponBuilder
{
    override fun build(): PhysicalWeapon {
        return PhysicalWeapon(attackDamage, weight)
    }
}