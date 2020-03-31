package me.sebbaindustries.aprilfools.listeners;

import com.github.vbauer.yta.model.Direction;
import com.github.vbauer.yta.model.Language;
import com.github.vbauer.yta.model.Translation;
import me.sebbaindustries.aprilfools.Core;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.Random;

public class Chat implements Listener {

    @EventHandler
    public void chatListener(ChatEvent e) {
        if (e.isCommand()) return;
        if (e.isProxyCommand()) return;
        if (!Core.startMadness) return;
        String input = e.getMessage();

        Translation translation = Core.api.translationApi().translate(input,
                Direction.of(Language.SL, randomLanguage()));
        String output = translation.text();

        e.setMessage(output);
    }

    private Language randomLanguage() {
        int max = 6;
        int min = 1;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        /*
        SL
        HR
        SK
        SR
        BG
        MK
        RU
         */
        switch (randomNum) {
            case 1:
                return Language.SL;
            case 2:
                return Language.HR;
            case 3:
                return Language.SK;
            case 4:
                return Language.SR;
            case 5:
                return Language.BG;
            case 6:
                return Language.MK;
        }
        return Language.SL;

    }

}
