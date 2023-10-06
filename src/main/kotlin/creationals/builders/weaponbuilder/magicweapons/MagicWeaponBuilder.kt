package creationals.builders.weaponbuilder.magicweapons

import creationals.builders.weaponbuilder.WeaponBuilder
import item.equipment.weapon.*

abstract class MagicWeaponBuilder: WeaponBuilder
{
    override fun build(): MagicWeapon {
        return MagicWeapon(attackDamage, weight)
    }
}