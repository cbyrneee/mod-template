package dev.cbyrne.modtemplate.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Excluded;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.minecraft.client.gui.screen.Screen;

@Config(name = "modtemplate")
public class Configuration implements ConfigData {
    @Excluded
    private static Configuration INSTANCE;
    
    public boolean enabled = true;

    public static Configuration getInstance() {
        if (INSTANCE == null) {
            INSTANCE = AutoConfig.register(Configuration.class, GsonConfigSerializer::new).get();
        }

        return INSTANCE;
    }

    public Screen getScreen(Screen parent) {
        // NOTE: This is not static as the configuration needs to be registered before we can get a screen for it
        return AutoConfig.getConfigScreen(Configuration.class, parent).get();
    }
}
