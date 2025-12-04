package Repositories;

import Models.Apps;
import java.util.ArrayList;
import java.util.List;

public class AppsRepo {
        public static void Apps() {
                List<Apps> apps = new ArrayList<>();
                Apps WallpaperEngine = new Apps("Diseño", "Wallpaper Engine", 23.99, "Personaliza y crea diseños");
                Apps BongoCat = new Apps("Ritmo", "Bongo Cat", 17.99, "Escucha y toca el bongo con un gato");
                Apps VtuberStudio = new Apps("Diseño, Vtuber", "Vtuber Studio", 93.99,
                                "Personaliza y crea un personaje para ser usado en camara");
                Apps BotMakerForDiscord = new Apps("Creador", "Bot maker for discord", 72.99,
                                "Realiza un bot para discord");
                Apps SoundPad = new Apps("Musica", "Sound pad", 45.99, "Crea musica y ritmo");
                Apps LosslessScaling = new Apps("Aumento de FPS", "Lossless Scaling", 33.99,
                                "Aumenta el rendimiento de los juegos");
                Apps GameMaker = new Apps("Diseño, Creacion", "Game Maker", 63.99, "Crea mapas y juegos a tu gusto");
                Apps RPG_Maker = new Apps("Diseño, Juegos", "RPG Maker", 59.99, "Crea un juego al estilo pixel art");
                Apps AutoClicker = new Apps("Clicker automatico", "Auto clicker", 29.99,
                                "Autoclicker simple para dejar la pc sola");
                Apps CoockieClicker = new Apps("Clicker automatico, Galleta?", "Coockie clicker", 38.99,
                                "Clickea una galleta a mas no poder");
                apps.add(WallpaperEngine);
                apps.add(BongoCat);
                apps.add(VtuberStudio);
                apps.add(BotMakerForDiscord);
                apps.add(SoundPad);
                apps.add(LosslessScaling);
                apps.add(GameMaker);
                apps.add(RPG_Maker);
                apps.add(AutoClicker);
                apps.add(CoockieClicker);

        }

}
