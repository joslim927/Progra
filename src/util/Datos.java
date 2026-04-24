/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import modelo.Usuario;

public class Datos {

    public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>() {{
        add(new Usuario(1, "jostin", "j12345", true, "admin"));
        add(new Usuario(2, "steve", "s12345", true, "user"));
        add(new Usuario(3, "user2", "User123!", true, "user"));
        add(new Usuario(4, "user3", "User123!", true, "user"));
        add(new Usuario(5, "user4", "User123!", true, "user"));
    }};

}