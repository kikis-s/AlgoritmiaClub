package Repositories;

import Models.Ost;
import java.util.ArrayList;
import java.util.List;

public class OstRepo {
    public static void Ost() {
        List<Ost> ost = new ArrayList<>();
        Ost Portal2OST = new Ost("Portal 2", "Portal 2 OST Volume 1 - Science is Fun", "2:34", "Ambientacion",
                "Mike Morasky");
        Ost OpeningSuite = new Ost("HALO", "Opening Suite", "0:29", "Orquestal", "Martin O'Donnell");
        Ost SpiderDance = new Ost("Undertale", "059. Spider Dance", "1:51", "Electronica, Chiptune, Orquestal",
                "Toby Fox y Temmie");
        Ost BlackKnife = new Ost("Deltarune", "30. Black Knife", "2:02", "Tema de batalla", "Toby Fox");
        Ost Resurrections = new Ost("Celeste", "Resurrections", "9:38", "Ambientacion", "Lena Raine");
        Ost Duet = new Ost("Omori", "OMORI OST - 172 DUET", "2:12", "Ambientacion", "OMOCAT");
        Ost CityRuins = new Ost("NieR Automata", "City Ruins - Rays of Light", "6:22", "Orquestal, Rock, Electroniica",
                "Keiichi Okabe");
        Ost Wolfgang = new Ost("Hi-Fi Rush", "Wolfgang's 5th Symphony", "7:31", "Combate, Electronica",
                "Wolfgang Gartner");
        Ost Corruption = new Ost("Terraria", "Corruption", "7:44", "Ambiental", "Re-Logic");
        Ost StardewValleyOvertune = new Ost("Strdew valley", "Stardew Valley Overtune", "2:26", "Iniciacion, Ambiente",
                "Conserned Ape");
        ost.add(Portal2OST);
        ost.add(OpeningSuite);
        ost.add(SpiderDance);
        ost.add(BlackKnife);
        ost.add(Resurrections);
        ost.add(Duet);
        ost.add(CityRuins);
        ost.add(Wolfgang);
        ost.add(Corruption);
        ost.add(StardewValleyOvertune);
    }
}