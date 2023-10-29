package game.item.equipment.weapon.enchanted

import game.enchantments.IEnchantment
import game.item.equipment.weapon.PhysicalWeapon

class EnchantedPhysicalWeapon(
    override var attackDamage: Int,
    override var weight: Int,
    override var enchantments: List<IEnchantment>
): PhysicalWeapon(attackDamage, weight), IEnchantedWeapon {
    override fun getWeaponType(): String {
        return "Enchanted " + super.getWeaponType()
    }
}