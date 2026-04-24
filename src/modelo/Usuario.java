/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Usuario {

    private int id;
    private String username;
    private String password;
    private boolean activo;
    private boolean bloqueado;
    private String rol;
    
    public Usuario(int id, String username, String password, boolean activo, String rol) {
        this.id = id;
    this.username = username;
    this.password = password;
    this.activo = activo;
    this.bloqueado = false;
    this.rol = rol;    
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public boolean isBloqueado() {
    return bloqueado;
}
 
    
public void setBloqueado(boolean bloqueado) {
    this.bloqueado = bloqueado;
}
public String getRol() {
    return rol; }
public void setUsername(String username) {
    this.username = username;
}

    public boolean isEstado() {
    return activo; // Cambia 'estado' por 'activo'
}

public void setEstado(boolean b) {
    this.activo = b; // Cambia 'estado' por 'activo'
}

}
