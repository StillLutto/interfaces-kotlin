package com.noxcrew.interfaces.interfaces

import com.noxcrew.interfaces.view.InterfaceView
import org.bukkit.event.inventory.InventoryCloseEvent

/** A handler run whenever a view is closed for a given reason. */
public fun interface CloseHandler {
    public suspend operator fun invoke(reason: InventoryCloseEvent.Reason, view: InterfaceView)
}
