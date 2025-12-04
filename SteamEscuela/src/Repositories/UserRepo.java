package Repositories;

import Service.RegistroService;
import Models.Users;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    public static void Users() {
        List<Users> users = new ArrayList<>();
        Users u1 = new Users("cris@gmail.com", "1234", "Cristian");
        users.add(u1);

        Users u = new Users(correo, contraseña, nombre);
        users.add(u);

    }

}
