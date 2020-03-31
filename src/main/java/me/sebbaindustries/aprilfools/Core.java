package me.sebbaindustries.aprilfools;

import co.aurasphere.jyandex.Jyandex;
import me.sebbaindustries.aprilfools.listeners.Chat;
import net.md_5.bungee.api.plugin.Plugin;

public class Core extends Plugin {

    public static Jyandex client;

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new Chat());
        client = new Jyandex("trnsl.1.1.20200331T154254Z.86b32d7df9293239.4b52f705ea30120d255bcdb93e6ed51a8db5cb0c");
    }

}
