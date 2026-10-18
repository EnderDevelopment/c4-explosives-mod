package com.enderdevelopment.c4_explosives;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class C4Menu extends AbstractContainerMenu {
    protected C4Menu(MenuType<?> type, int containerId) {
        super(type, containerId);
    }

    public C4Menu(int containerId, Inventory inventory) {
        this(C4ExplosivesMod.C4_MENU, containerId);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}