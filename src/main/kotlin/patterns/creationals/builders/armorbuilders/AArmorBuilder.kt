package patterns.creationals.builders.armorbuilders
import patterns.creationals.builders.IBuilder
import game.item.equipment.armor.Armor


abstract class AArmorBuilder: IBuilder
{
    abstract var physicalDefence: Int
    abstract var magicDefence: Int

    override fun build(): Armor {
        return Armor(
            this.physicalDefence,
            this.magicDefence,
            this.weight
        )
    }
}