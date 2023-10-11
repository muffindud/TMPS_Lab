package character.npc.monster

import character.Character
import character.npc.NPC

class Monster(
    override var healthPoints: Int,
    override var xPosition: Int,
    override var yPosition: Int,
    var type: String
): NPC
{
    override fun attack(target: Character) {
        TODO("Not yet implemented")
    }

    override fun getCharacterType(): String = type
}