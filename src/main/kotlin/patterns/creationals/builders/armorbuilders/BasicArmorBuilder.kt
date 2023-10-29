package patterns.creationals.builders.armorbuilders

class BasicArmorBuilder: AArmorBuilder()
{
    override var physicalDefence: Int = 5
    override var magicDefence: Int = 5
    override var weight: Int = 10
}