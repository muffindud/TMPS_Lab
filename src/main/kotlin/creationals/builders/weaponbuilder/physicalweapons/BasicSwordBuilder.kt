package creationals.builders.weaponbuilder.physicalweapons

import creationals.builders.weaponbuilder.WeaponBuilder

class BasicSwordBuilder: PhysicalWeaponBuilder()
{
    override var attackDamage: Int = 15
    override var weight: Int = 10
}