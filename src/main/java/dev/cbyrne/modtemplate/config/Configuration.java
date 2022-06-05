package dev.cbyrne.modtemplate.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.client.gui.screen.Screen;

@Config(name = "modtemplate")
public class Configuration implements ConfigData {
    public boolean enabled = true;

    public static Configuration getInstance() {
        return AutoConfig.getConfigHolder(Configuration.class).get();
    }

    public static Screen getScreen(Screen parent) {
        return AutoConfig.getConfigScreen(Configuration.class, parent).get();
    }
}
