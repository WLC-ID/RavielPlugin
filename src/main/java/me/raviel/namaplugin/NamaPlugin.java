package me.raviel.namaplugin;

import java.util.List;

import me.raviel.namaplugin.settings.Settings;
import me.raviel.lib.configuration.Config;
import me.raviel.lib.RavielLib;
import me.raviel.lib.RavielPlugin;
import me.raviel.lib.compatibility.CompatibleMaterial;
import me.raviel.lib.plugin.PluginInfo;

public class NamaPlugin extends RavielPlugin{

    private static NamaPlugin instance;

    // TODO Define private final Config somethingFile = new Config(this, "something.yml");

    // TODO Define Manager

    public static NamaPlugin getInstance(){
        return instance;
    }

	@Override
	public void onPluginLoad() {
		instance = this;
        RavielLib.register(new PluginInfo(instance, "1.2.0", CompatibleMaterial.BARRIER));
    }
    

	@Override
	public void onPluginEnable() {

        Settings.setupConfig();
        this.setLocale(Settings.LANGUAGE_FILE.getString(), false);
		// TODO
		
	}

	@Override
	public void onPluginDisable() {
		// TODO 
	}

	@Override
	public List<Config> getExtraConfig() {
        return null;
        
	}

	@Override
	public void onConfigReload() {
        this.setLocale(Settings.LANGUAGE_FILE.getString(), true);
        // TODO
	}

}