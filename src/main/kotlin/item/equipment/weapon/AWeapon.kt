package item.equipment.weapon

import item.equipment.AEquipment

abstract class AWeapon: AEquipment()
{
    open var attackDamage: Int = 0
    override var slots: Int = 1
    override var weight: Int = 1

    abstract fun getWeaponType (): String
}