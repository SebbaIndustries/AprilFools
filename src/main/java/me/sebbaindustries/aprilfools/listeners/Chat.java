package me.sebbaindustries.aprilfools.listeners;

import co.aurasphere.jyandex.dto.Language;
import co.aurasphere.jyandex.dto.TranslateTextResponse;
import me.sebbaindustries.aprilfools.Core;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.Arrays;

public class Chat implements Listener {

    @EventHandler
    public void chatListener(ChatEvent e){
        String input = e.getMessage();
        TranslateTextResponse output = Core.client.translateText(input, Language.RUSSIAN);
        String[] reply = output.getTranslatedText();

        e.setMessage(Arrays.toString(reply));
    }

}
