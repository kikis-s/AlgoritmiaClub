package Repositories;

import Models.Games;
import java.util.ArrayList;
import java.util.List;

public class GamesRepo {
    public static void Games() {
        List<Games> juegos = new ArrayList<>();
        Games Halo = new Games("Halo", 69.99, "Juego de disparos", "Shooter");
        Games HollowKnight = new Games("Hollow Knight", 20.00, "Juego de exploracion", "Roguelike");
        Games Fortnite = new Games("Fortnite", 0.00, "Juego de disparos en formato royale", "Shooter");
        Games StardewValley = new Games("Stardew Valley", 15.00, "Juego tranquilo de granja", "Granja, Tranquilo");
        Games Celeste = new Games("Celeste", 29.99, "Juego platformero", "Plataforma");
        Games Terraria = new Games("Terraria", 20.00, "Juego de supervivencia", "Exploracion, Aventura");
        Games GeometryDash = new Games("Geometry Dash", 14.99, "Juego de ritmo", "Ritmico");
        Games EldenRing = new Games("Elden Ring", 49.99, "Juego de exploracion", "Exploracion, Combate");
        Games Expedition33 = new Games("Expedition 33", 79.99, "Juego de exploracion", "Exploracion, Supervivencia");
        Games PayDay = new Games("Pay Day", 49.99, "Juego de disparos y de combate grupal", "Accion");
        juegos.add(Halo);
        juegos.add(HollowKnight);
        juegos.add(Fortnite);
        juegos.add(StardewValley);
        juegos.add(Celeste);
        juegos.add(Terraria);
        juegos.add(GeometryDash);
        juegos.add(EldenRing);
        juegos.add(Expedition33);
        juegos.add(PayDay);
    }

}
