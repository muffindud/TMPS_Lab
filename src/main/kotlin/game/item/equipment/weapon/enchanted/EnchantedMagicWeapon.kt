package game.item.equipment.weapon.enchanted

import game.enchantments.IEnchantment
import game.item.equipment.weapon.MagicWeapon

class EnchantedMagicWeapon(
    override var attackDamage: Int,
    override var weight: Int,
    override var enchantments: List<IEnchantment>
): MagicWeapon(attackDamage, weight), IEnchantedWeapon {
    override fun getWeaponType(): String {
        return "Enchanted " + super.getWeaponType()
    }
}