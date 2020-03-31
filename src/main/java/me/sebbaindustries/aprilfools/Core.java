package me.sebbaindustries.aprilfools;

import com.github.vbauer.yta.service.YTranslateApiImpl;
import me.sebbaindustries.aprilfools.commands.Toggle;
import me.sebbaindustries.aprilfools.listeners.Chat;
import net.md_5.bungee.api.plugin.Plugin;

public class Core extends Plugin {

    public static YTranslateApiImpl api;
    public static boolean startMadness = false;

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new Chat());
        getProxy().getPluginManager().registerCommand(this, new Toggle("toggleglobal", "aprilfools.toggle", "aprilfools"));
        api = new YTranslateApiImpl("trnsl.1.1.20200331T154254Z.86b32d7df9293239.4b52f705ea30120d255bcdb93e6ed51a8db5cb0c");
    }

}
