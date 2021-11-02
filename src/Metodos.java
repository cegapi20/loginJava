
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dam
 */
public class Metodos {

    public static boolean verificarUsuario(String usuario, String contraseña) {
        boolean verificado = false;

        if (MetodosBD.buscarUsuario(usuario, contraseña) > 0) {
            verificado = true;
        }

        return verificado;
    }

    public static boolean confirmarDatos(String usuario, String contraseña1, String contraseña2) {
        boolean verificar = false;
        if (!usuario.isEmpty() && contraseña1.equals(contraseña2)) {
            verificar = true;
        }

        return verificar;
    }

    public static boolean verificarCorreo(String correo) {
        boolean verificar = false;
        if (correo.matches("[a-zA-Z\\.0-9]*@[a-zA-Z]*\\.com")) {

            verificar = true;
        }
        return verificar;

    }

    public static boolean agregarDatos(String usuario, String contraseña, String confContraseña) {

        boolean verificar = false;
        if (Metodos.confirmarDatos(usuario, contraseña, confContraseña)) {
            MetodosBD.insertarDatos(usuario, contraseña);
            verificar = true;

        }
        return verificar;
    }

    public static boolean agregarDatos(String usuario, String contraseña, String confContraseña, String nombre, String apellidos, Date fecha, String correo) {
        boolean verificar = false;
        if (verificarCorreo(correo) && !apellidos.isEmpty() && !correo.isEmpty() && !fecha.toString().isEmpty()) {
            if (agregarDatos(usuario, contraseña, confContraseña)) {
                int id = MetodosBD.buscarUsuario(usuario, contraseña);
                MetodosBD.insertarDatosOp(id, nombre, apellidos, fecha, correo);
                verificar = true;
            }

        }
        return verificar;
    }
    
    public static boolean agregarNuevaContraseña(String usuario, String contraseña, String confContraseña){
        boolean verificar = false;
        if(confirmarDatos(usuario, contraseña, confContraseña)){
            MetodosBD.insertarNuevaContraseña(usuario, contraseña);
            verificar = true;
        }
        return verificar;     
    }

}
