package item.equipment.weapon

import item.equipment.Equipment

abstract class Weapon: Equipment() {
    open var attackDamage: Int = 0
    override var slots: Int = 1
    override var weight: Int = 1

    abstract fun getWeaponType (): String
}