package character.npc.monster

import character.ICharacter
import character.npc.INPC

class Monster(
    override var healthPoints: Int,
    override var xPosition: Int,
    override var yPosition: Int,
    var type: String
): INPC
{
    override fun attack(target: ICharacter) {
        TODO("Not yet implemented")
    }

    override fun getCharacterType(): String = type
}