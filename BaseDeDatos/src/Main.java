import java.sql.*;
import java.util.Scanner;

public class Main {
    private static Connection connection;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        try {

            // Connection URL
            // Syntaxis
            // <driver>:<gestor de base de datos>://<servidor>:<puerto>/<base de datos>

            // Prepared statements
            // Para INSERT, UPDATE, DELETE
            // Para guardar los datos de forma segura.
            //("INSERT INTO tabla VALUES (?, ?, ?)");
            //ps.setIt(1, 10);
            //ps.setString(2, "Hola");
            //ps.setString(3, "Mundo");
            //ps.executeUpdate();

            // Para SELECT
            // Statement
            // st.createStatement();
            // st.executeQuery("QUERY"); y Result Set
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/STUDENTS", "ae22mp", "Alex22sv");
            while(flag){
                // Switch
                System.out.println("Main Menu\n\n1. Create Student table\n2. Insert entries\n3. Select entries\n4. Update student\n5. Delete student\n6. Delete table\n7. Exit");
                switch(scanner.nextInt()){
                    case 1:
                        crearTabla();
                        break;
                    case 2:
                        insertarEstudiantes();
                        break;
                    case 3:
                        obtenerEstudiantes();
                        break;
                    case 4:
                        actualizarEstudiante();
                        break;
                    case 5:
                        eliminarEstudiante();
                        break;
                    case 6:
                        eliminarTabla();
                        break;
                    case 7:
                        connection.close();
                        flag = false;
                        System.exit(0);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error de base de datos");
            e.printStackTrace();
        }
    }

    private static void crearTabla() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE Estudiantes(ID int PRIMARY KEY NOT NULL, Nombre VARCHAR(25) NOT NULL, Edad INT NOT NULL, Universidad VARCHAR(25) NOT NULL)");
        System.out.println("Tabla creada");
    }
    private static void insertarEstudiantes() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Estudiantes VALUES(?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?)");
        ps.setInt(1, 1);
        ps.setString(2, "Alex");
        ps.setInt(3, 19);
        ps.setString(4, "UCA");
        ps.setInt(5, 2);
        ps.setString(6, "Diego");
        ps.setInt(7, 20);
        ps.setString(8, "UCA");
        ps.setInt(9, 3);
        ps.setString(10, "Isaac");
        ps.setInt(11, 20);
        ps.setString(12, "UCA");
        ps.setInt(13, 4);
        ps.setString(14, "Abraham");
        ps.setInt(15, 20);
        ps.setString(16, "UCA");
        ps.setInt(17, 5);
        ps.setString(18, "Rafa");
        ps.setInt(19, 21);
        ps.setString(20, "UCA");

        int affectedRows = ps.executeUpdate();
        System.out.println(affectedRows + " fila(s) actualizadas");
    }
    private static void obtenerEstudiantes() throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Estudiantes");
        while(resultSet.next()){
            System.out.println(resultSet.getInt("ID") + " - " + resultSet.getString("Nombre") + " - " + resultSet.getInt("Edad") + " - " + resultSet.getString("Universidad"));
        }
    }
    private static void actualizarEstudiante() throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Estudiantes SET Universidad = ? WHERE ID = ?");
        preparedStatement.setString(1, "UDB");
        preparedStatement.setInt(2, 1);
        int affectedRows = preparedStatement.executeUpdate();
        System.out.println(affectedRows + " fila(s) actualizadas");
    }
    private static void eliminarEstudiante() throws SQLException{
        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM Estudiantes WHERE ID = 1");
        System.out.println("Estudiante eliminado");
    }
    private static void eliminarTabla() throws SQLException{
        Statement statement = connection.createStatement();
        statement.execute("DROP TABLE Estudiantes");
        System.out.println("Tabla eliminada");
    }
}
