package Repositories;

import Models.Mods;
import java.util.ArrayList;
import java.util.List;

public class ModsRepo {
    public static void Mods() {
        List<Mods> mods = new ArrayList<>();
        Mods Calamity = new Mods("Terraria", "Amplia la dificultad del juego", "Calamity");
        Mods AquaUI = new Mods("Terraria", "Expande el juego con mas detalles", "AquaUI");
        Mods Epiphany = new Mods("The binding of isaac", "Amplia la dificultad y recursos del juego", "Epiphany");
        Mods WhitePalace = new Mods("Hollow Knight",
                "Expande el juego con 5 nuevos jefes con aun mas dificultad y nuevos desafios", "White Palace");
        Mods MinecraftZombie = new Mods("Left4Dead", "Customiza los mapas y a los zombies como si fuera Minecraft",
                "Minecraft Zombie");
        Mods SF6JUKEBOX = new Mods("Street Fighter", "Cambia diseños", "SF6JUKEBOX");
        Mods Expanded = new Mods("Stardew valley", "Expande el mapa del juego y la historia con nuevos personajes",
                "Expanded");
        Mods CleroMods = new Mods("GTA San Andreas", "Agrega distintos modificadores en el juego", "Clero Mods");
        Mods Geode = new Mods("Geometry dash", "Obten un menu de modificadores del juego", "Geode");
        Mods TraduccionEspañol = new Mods("Limbus Company", "Traduce el juego al español", "Traduccion Español");
        mods.add(Calamity);
        mods.add(AquaUI);
        mods.add(Epiphany);
        mods.add(WhitePalace);
        mods.add(MinecraftZombie);
        mods.add(SF6JUKEBOX);
        mods.add(Expanded);
        mods.add(CleroMods);
        mods.add(Geode);
        mods.add(TraduccionEspañol);

    }
}
