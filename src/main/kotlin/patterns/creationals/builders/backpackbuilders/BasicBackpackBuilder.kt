package patterns.creationals.builders.backpackbuilders

class BasicBackpackBuilder: ABackpackBuilder()
{
    override var slots: Int = 10
    override var backpackSlots: Int = 10
    override var weight: Int = 10
}