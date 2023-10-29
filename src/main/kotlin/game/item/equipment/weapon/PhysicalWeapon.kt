package game.item.equipment.weapon

open class PhysicalWeapon(override var attackDamage: Int, override var weight: Int): AWeapon()
{
    override var slots: Int = 3

    override fun getWeaponType(): String {
        return "Physical"
    }
}