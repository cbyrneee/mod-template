package dev.cbyrne.modtemplate;

import com.mojang.logging.LogUtils;
import dev.cbyrne.modtemplate.config.Configuration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class ModTemplate implements ModInitializer {
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        var enabled = Configuration.getInstance().enabled;
        LOGGER.info("ModTemplate is " + (enabled ? "enabled" : "disabled"));
    }
}
