package creationals.builders.weaponbuilder.magicweapons

import creationals.builders.weaponbuilder.IWeaponBuilder
import item.equipment.weapon.*

abstract class AMagicWeaponBuilder: IWeaponBuilder
{
    override fun build(): MagicWeapon {
        return MagicWeapon(attackDamage, weight)
    }
}