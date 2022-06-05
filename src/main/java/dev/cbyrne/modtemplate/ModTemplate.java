package dev.cbyrne.modtemplate;

import com.mojang.logging.LogUtils;
import dev.cbyrne.modtemplate.config.Configuration;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class ModTemplate implements ModInitializer {
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        AutoConfig.register(Configuration.class, GsonConfigSerializer::new);
        LOGGER.info("ModTemplate is " + (Configuration.getInstance().enabled ? "enabled" : "disabled"));
    }
}
