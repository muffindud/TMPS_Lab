package patterns.structurals.facade

import game.ui.InventoryWindow
import game.ui.MapWindow
import game.ui.Menu
import game.ui.Toolbar

class UI {
    var menu: Menu = Menu
    var menuVisible: Boolean = menu.visible

    var mapWindow: MapWindow = MapWindow
    var mapWindowVisible: Boolean = mapWindow.visible

    var inventoryWindow: InventoryWindow = InventoryWindow
    var inventoryWindowVisible: Boolean = inventoryWindow.visible

    var toolbar: Toolbar = Toolbar
    var toolbarVisible: Boolean = toolbar.visible

    fun show() {
        // Apply the previous state of the UI before hiding it
        if (menuVisible) menu.show()
        if (mapWindowVisible) mapWindow.show()
        if (inventoryWindowVisible) inventoryWindow.show()
        if (toolbarVisible) toolbar.show()
    }

    fun hide() {
        // Update the current state of the UI
        menuVisible = menu.visible
        mapWindowVisible = mapWindow.visible
        inventoryWindowVisible = inventoryWindow.visible
        toolbarVisible = toolbar.visible

        menu.hide()
        mapWindow.hide()
        inventoryWindow.hide()
        toolbar.hide()
    }
}