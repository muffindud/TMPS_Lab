package creationals.builders.weaponbuilder.physicalweapons

import creationals.builders.weaponbuilder.IWeaponBuilder
import item.equipment.weapon.*

abstract class APhysicalWeaponBuilder: IWeaponBuilder
{
    override fun build(): PhysicalWeapon {
        return PhysicalWeapon(attackDamage, weight)
    }
}