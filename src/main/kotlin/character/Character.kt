package character

interface Character {
    val healthPoints: Int
    val xPosition: Int
    val yPosition: Int

    fun attack(target: Character)
    fun getCharacterType() : String
}