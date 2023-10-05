package character

interface Character
{
    var healthPoints: Int
    var xPosition: Int
    var yPosition: Int

    fun attack(target: Character)
    fun getCharacterType(): String
}