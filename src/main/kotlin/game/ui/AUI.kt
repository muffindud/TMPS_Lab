package game.ui

abstract class AUI {
    abstract var xPosition: Int
    abstract var width: Int
    abstract var yPosition: Int
    abstract var height: Int

    abstract var visible: Boolean

    fun show() {
        this.update()
        this.visible = true

        TODO("Not yet implemented")
    }

    fun hide() {
        this.visible = false

        TODO("Not yet implemented")
    }

    fun update() {
        TODO("Not yet implemented")
    }
}