package net.enriquitomc.mods.helium.utils;

import net.enriquitomc.mods.helium.utils.storage.UtilsStored;

import java.util.function.Supplier;

public class Utils implements UtilsStored {

    public void register(String name){

        UtilsStored.getUtilStored("net.minecraft.vortex.LazyVortex");

    }

}
