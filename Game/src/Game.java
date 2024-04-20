import locations.*;
import logistics.*;
import items.*;
import util.GameUtilities;
import util.GeneralUtilities;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Game {
    private static Lobby lobby;
    // Lobby tiene que ser estático al accederse en algo estático.
    public static void main(String[] args) throws  InterruptedException {
        System.out.println("                        FORTNITE                        ");
        System.out.println("********************************************************");
        System.out.println("How many players are playing? ");
        int numPlayers = GeneralUtilities.readInteger();

        Option opt1 = new Option(1, "Select characters", "Choose one of the characters");
        Option opt2 = new Option(2, "Select accessories", "Customize accessories");
        ArrayList<Option> options = new ArrayList<Option>();
        options.add(opt1);
        options.add(opt2);
        lobby = new Lobby(1, options);
        receivePlayers(numPlayers);
        Map map = mapSelection();
        GameMode gamemode = modeSelection();
        Match match = new Match(1, gamemode, lobby.getPlayers(), map);
        System.out.println("Please wait while we prepare the match for you...");
        TimeUnit.SECONDS.sleep(10); //esta línea podría salir muy mal, según sistema operativo, por eso está thrown exception
        System.out.println("Let the match begin!!");
        run(match);

    }
    private static void receivePlayers(int n){
        for(int i = 0; i < n; ++i){
            lobby.addPlayer(Player.createPlayer());
        }
    }
    private static Map mapSelection(){
        System.out.println("Where do you want to play?");
        System.out.println("1. Ukraine");
        System.out.println("2. Gaza");
        int opt = GeneralUtilities.readInteger();
        Storm storm = new Storm(1,"dangerous",25);
        ArrayList<Item> items = GameUtilities.generateItems();
        Map m = null;
        switch (opt) {
            case 1:
                m = new Map(1, "Ukraine", 2000, 1000, "Vodka", storm, items);
                break;
            case 2:
                m = new Map(1, "Gaza", 1500, 800, "Lisan al-Gaib", storm, items);
                break;
        }
        return m;
    }
    private static GameMode modeSelection() {
        System.out.println("How do you want to play?");
        System.out.println("1. Free-for-all");
        System.out.println("2. Teams");
        int opt = GeneralUtilities.readInteger();
        GameMode m = null;
        switch (opt) {
            case 1:
                m = new GameMode(1, "Free-for-all", "Everybody can hit anybody.");
                break;
            case 2:
                m = new GameMode(2, "Teams", "Don't hit your teammates ;).");
                break;
        }
        return m;
    }
    private static void run(Match match) {
        /*
        - Mostrar un menú de opciones (buscar item, agarrar item, usar item, dañar a alguien, construir, mover
        - Implementar las opciones
        */
    }
}