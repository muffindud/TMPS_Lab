package item.equipment.weapon

abstract class MagicWeapon: Weapon() {
    override var slots: Int = 2

    override fun getWeaponType(): String {
        return "Magic"
    }
}