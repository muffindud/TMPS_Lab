package item.equipment.weapon

abstract class PhysicalWeapon: Weapon() {
    override var slots: Int = 3

    override fun getWeaponType(): String {
        return "Physical"
    }
}