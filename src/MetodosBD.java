
import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class MetodosBD {

    public static String url = ("jdbc:derby://localhost:1527/Hannah");
    public static String login = "Hannah";
    public static String pwd = "123456";
    public static Connection cn;
    public static Statement stmt;

    public static void conectar() {
        try {

            cn = DriverManager.getConnection(url, login, pwd);
            if (true) {
                System.out.println("Conexion realizada");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertarDatos(String usuario, String contraseña) {

        PreparedStatement pstmt = null;
        String stInserta = "INSERT INTO HANNAH.USUARIOS (USUARIO, CONTRASEÑA)  VALUES(?,?)";

        try {
            pstmt = cn.prepareStatement(stInserta);
            pstmt.setString(1, usuario);
            pstmt.setString(2, contraseña);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insertado correctamente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertarDatosOp(int id, String nombre, String apellidos, Date fecha, String correo) {
        PreparedStatement pstmt = null;
        String stSQL = "INSERT INTO HANNAH.DATOS_USUARIO (ID_USUARIO, NOMBRE, APELLIDOS, FECHA_NACIMIENTO, CORREO)  VALUES(?,?,?,?,?)";

        try {
            pstmt = cn.prepareStatement(stSQL);
            pstmt.setInt(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setDate(4, fecha);
            pstmt.setString(5, correo);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insertado correctamente.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int buscarUsuario(String usuario, String contraseña) {
        PreparedStatement pstmt = null;
        String stSQL = "SELECT * FROM HANNAH.USUARIOS WHERE USUARIO =? AND CONTRASEÑA =?";
        ResultSet rs;
        int numId = 0;
        try {
            pstmt = cn.prepareStatement(stSQL);
            pstmt.setString(1, usuario);
            pstmt.setString(2, contraseña);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                numId = rs.getInt("ID");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numId;

    }

    public static int buscarUsuario(String usuario) {
        PreparedStatement pstmt = null;
        String stSQL = "SELECT * FROM HANNAH.USUARIOS WHERE USUARIO =?";
        ResultSet rs;
        int numId = 0;
        try {
            pstmt = cn.prepareStatement(stSQL);
            pstmt.setString(1, usuario);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                numId = rs.getInt("ID");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numId;

    }
    
    public static void insertarNuevaContraseña(String usuario, String contraseña){
        PreparedStatement pstmt = null;
        String stInserta = "UPDATE HANNAH.USUARIOS SET CONTRASEÑA=? WHERE USUARIO=?";
        

        try {
            pstmt = cn.prepareStatement(stInserta);
            pstmt.setString(1, contraseña);
            pstmt.setString(2, usuario);
            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insertado correctamente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
