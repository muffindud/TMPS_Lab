package creationalclasses

import character.player.*

class Prototypes
{
    companion object {
        private val instance: Prototypes? = null
    }

    fun getInstance(): Prototypes {
        return instance ?: Prototypes()
    }

    val builders: Builders = Builders().getInstance()

    val magePlayerBasicLoadout: MagePlayer = MagePlayer(
        armor = builders.basicArmorBuilder.build(),
        backpack = builders.basicBackpackBuilder.build(),
        weapon = builders.basicCatalystBuilder.build(),
        playerName = "",
        xPosition = 0,
        yPosition = 0
    )
    val magePlayerUncommonLoadout: MagePlayer = MagePlayer(
        armor = builders.uncommonArmorBuilder.build(),
        backpack = builders.uncommonBackpackBuilder.build(),
        weapon = builders.uncommonCatalystBuilder.build(),
        playerName = "",
        xPosition = 0,
        yPosition = 0
    )

    val warriorPlayerBasicLoadout: WarriorPlayer = WarriorPlayer(
        armor = builders.basicArmorBuilder.build(),
        backpack = builders.basicBackpackBuilder.build(),
        weapon = builders.basicSwordBuilder.build(),
        playerName = "",
        xPosition = 0,
        yPosition = 0
    )
    val warriorPlayerUncommonLoadout: WarriorPlayer = WarriorPlayer(
        armor = builders.uncommonArmorBuilder.build(),
        backpack = builders.uncommonBackpackBuilder.build(),
        weapon = builders.uncommonSwordBuilder.build(),
        playerName = "",
        xPosition = 0,
        yPosition = 0
    )
}