package me.raviel;

import java.util.List;

import me.raviel.Settings.Settings;
import me.raviel.configuration.Config;
import me.raviel.lib.RavielPlugin;

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
    }
    

	@Override
	public void onPluginEnable() {

        Settings.setupConfig();
        this.setLocale(Settings.LANGUGE_FILE.getString(), false);
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
        this.setLocale(Settings.LANGUGE_FILE.getString(), true);
        // TODO
	}

}