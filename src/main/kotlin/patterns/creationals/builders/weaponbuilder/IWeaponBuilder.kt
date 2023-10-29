package patterns.creationals.builders.weaponbuilder

import patterns.creationals.builders.IBuilder

interface IWeaponBuilder: IBuilder
{
    var attackDamage: Int
}