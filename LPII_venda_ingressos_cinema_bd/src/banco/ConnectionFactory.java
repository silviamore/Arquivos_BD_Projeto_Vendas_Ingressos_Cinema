package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author silvinha01
 */
public class ConnectionFactory {

    private final static String HOST = "localhost";
    private final static String PORT = "5432";
    private final static String BD = "LPII_venda_ingressos_cinema_bd";
    private final static String URL = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + BD;
    private final static String USUARIO = "postgres";
    private final static String SENHA = "65873412";

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (conexao);
    }

}
