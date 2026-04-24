/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuario;
import util.Datos;

public class LoginController {

    public Usuario validar(String username, String password) {

        for (Usuario u : Datos.listaUsuarios) {
            System.out.println("Comparando con: " + u.getUsername() + " - " + u.getPassword());
System.out.println("Ingresado: " + username + " - " + password);
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)
                    && u.isActivo()
                    && !u.isBloqueado()){
// && !u.isBloqueado()
                return u;
            }
        }
        return null;
    }
}
