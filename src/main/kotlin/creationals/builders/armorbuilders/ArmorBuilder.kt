package creationals.builders.armorbuilders
import item.equipment.armor.Armor


abstract class ArmorBuilder
{
    abstract var physicalDefence: Int
    abstract var magicDefence: Int
    abstract var weight: Int

    fun build(): Armor {
        return Armor(
            this.physicalDefence,
            this.magicDefence,
            this.weight
        )
    }
}