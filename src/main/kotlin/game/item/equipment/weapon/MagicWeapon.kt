package game.item.equipment.weapon

class MagicWeapon(override var attackDamage: Int, override var weight: Int): AWeapon()
{
    override var slots: Int = 2

    override fun getWeaponType(): String {
        return "Magic"
    }
}