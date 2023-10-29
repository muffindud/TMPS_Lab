package item.equipment.weapon

class PhysicalWeapon(override var attackDamage: Int, override var weight: Int): AWeapon()
{
    override var slots: Int = 3

    override fun getWeaponType(): String {
        return "Physical"
    }
}