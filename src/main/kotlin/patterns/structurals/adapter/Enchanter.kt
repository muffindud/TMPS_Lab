package patterns.structurals.adapter

import game.enchantments.IEnchantment
import game.enchantments.miscenchantments.IRemoveWeight
import game.enchantments.weaponenchantments.AddAttack1
import game.enchantments.weaponenchantments.IAddAttack
import game.item.equipment.weapon.AWeapon
import game.item.equipment.weapon.enchanted.EnchantedMagicWeapon
import game.item.equipment.weapon.enchanted.EnchantedPhysicalWeapon
import game.item.equipment.weapon.enchanted.IEnchantedWeapon

object Enchanter {
    fun enchantWeapon(targetWeapon: AWeapon, enchantments: List<IEnchantment>): AWeapon {
        var attackDamage = targetWeapon.attackDamage
        var weight = targetWeapon.weight

        for (enchantment in enchantments) {
            if (enchantment is IAddAttack) {
                attackDamage += enchantment.attackAddModifier
            }
            if (enchantment is IRemoveWeight) {
                weight += (weight + enchantment.weightMultModifier).toInt()
            }
        }

        return if (targetWeapon.getWeaponType() == "Magic") {
            EnchantedMagicWeapon(targetWeapon.attackDamage, targetWeapon.weight, enchantments)
        } else if (targetWeapon.getWeaponType() == "Physical") {
            EnchantedPhysicalWeapon(targetWeapon.attackDamage, targetWeapon.weight, enchantments)
        } else {
            throw Exception("Unknown weapon type")
        }
    }
}