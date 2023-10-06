package character.npc.monster

import character.Character
import character.npc.NPC

class Monster(override var healthPoints: Int, override var xPosition: Int, override var yPosition: Int): NPC
{
    override fun attack(target: Character) {
        TODO("Not yet implemented")
    }

    override fun getCharacterType(): String {
        TODO("Not yet implemented")
    }

}