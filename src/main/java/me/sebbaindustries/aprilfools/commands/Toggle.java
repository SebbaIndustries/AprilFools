package me.sebbaindustries.aprilfools.commands;

import me.sebbaindustries.aprilfools.Core;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Toggle extends Command {

    public Toggle(String name, String permission, String... aliases) {
        super(name, permission, aliases);
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        if (!(commandSender instanceof ProxiedPlayer)) {
            if (!Core.startMadness) {
                Core.startMadness = true;
                commandSender.sendMessage(translate("&8[&6AprilFools&8] &4WHAT HAVE YOU DONE???"));
                commandSender.sendMessage(translate("&8[&6AprilFools&8] &4WHAT HAVE YOU DONE???"));
                commandSender.sendMessage(translate("&8[&6AprilFools&8] &4WHAT HAVE YOU DONE???"));
                commandSender.sendMessage(translate("&8[&6AprilFools&8] &6Oy Nzd here I want to say good luck, but I like to watch the world burn so :3"));
                return;
            }
            Core.startMadness = false;
            commandSender.sendMessage(translate("&8[&6AprilFools&8] &3World sucks again thanks to you"));
            return;
        }
        /*
        ProxiedPlayer player = (ProxiedPlayer) commandSender;
        if (Core.toggleList.contains(player)) {
            Core.toggleList.remove(player);
            player.sendMessage(translate("&8[&6AprilFools&8] &aChat je zdaj v slovenščini"));
            return;
        }
        Core.toggleList.add(player);
        player.sendMessage(translate("&8[&6AprilFools&8] &bChat je zdaj v tujih jezikih"));

         */
    }

    private String translate(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
