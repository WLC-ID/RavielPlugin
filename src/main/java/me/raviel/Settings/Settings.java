package me.raviel.Settings;

import me.raviel.NamaPlugin;
import me.raviel.compatibility.CompatibleMaterial;
import me.raviel.configuration.Config;
import me.raviel.configuration.ConfigSetting;

public class Settings {

    static final Config config = NamaPlugin.getInstance().getCoreConfig();

    public static final ConfigSetting WHAT = new ConfigSetting(config, "Main.What", "anything");

    public static final ConfigSetting GLASS_TYPE_1 = new ConfigSetting(config, "Interfaces.Glass Type 1", 7);
    public static final ConfigSetting GLASS_TYPE_2 = new ConfigSetting(config, "Interfaces.Glass Type 2", 11);
    public static final ConfigSetting GLASS_TYPE_3 = new ConfigSetting(config, "Interfaces.Glass Type 3", 3);
    
    public static final ConfigSetting SETTINGS = new ConfigSetting(config, "System.Settings", "anything");
    public static final ConfigSetting LANGUGE_FILE = new ConfigSetting(config, "System.Language", "en_US",
            "The enabled language file.",
            "More language files (if available) can be found in the plugins data folder.");

    public static void setupConfig() {
        config
                .setDefaultComment("Main", "General settings and options.")
                .setDefaultComment("Interfaces", 
                        "These settings allow you to alter the way interfaces look.",
                        "They are used in GUI's to make patterns, change them up then open up a",
                        "# GUI to see how it works.")
                .setDefaultComment("Language File", "System related settings.");
        config.load();
        config.setAutoremove(true).setAutosave(true);

        int color;
        if ((color = GLASS_TYPE_1.getInt(-1)) != -1) {
            config.set(GLASS_TYPE_1.getKey(), CompatibleMaterial.getGlassPaneColor(color).name());
        }
        if ((color = GLASS_TYPE_2.getInt(-1)) != -1) {
            config.set(GLASS_TYPE_2.getKey(), CompatibleMaterial.getGlassPaneColor(color).name());
        }
        if ((color = GLASS_TYPE_3.getInt(-1)) != -1) {
            config.set(GLASS_TYPE_3.getKey(), CompatibleMaterial.getGlassPaneColor(color).name());
        }

        config.saveChanges();
    }
        
    
}