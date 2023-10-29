package patterns.creationals.builders.weaponbuilder.magicweapons

import patterns.creationals.builders.weaponbuilder.IWeaponBuilder
import item.equipment.weapon.*

abstract class AMagicWeaponBuilder: IWeaponBuilder
{
    override fun build(): MagicWeapon {
        return MagicWeapon(attackDamage, weight)
    }
}