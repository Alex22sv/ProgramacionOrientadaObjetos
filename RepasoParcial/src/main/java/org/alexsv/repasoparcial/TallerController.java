package org.alexsv.repasoparcial;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;

public class TallerController implements Initializable {
    // Registrar empleados
    @FXML
    TextField registrarEmpleadoNombre;
    @FXML
    TextField registrarEmpleadoApellido;
    @FXML
    Button registrarEmpleadoBoton;
    // Registrar tareas
    @FXML
    TextField registrarTareaEmpleadoId;
    @FXML
    TextField registrarTareaPrecio;
    @FXML
    TextField registrarTareaInput;
    @FXML
    TextField registrarTareaCategoriaId;
    @FXML
    Button registrarTareaEmpleadoBoton;
    // Registrar categorias
    @FXML
    TextField registrarCategoriaInput;
    @FXML
    Button registrarCategoriaBoton;
    // Mostrar lista de tareas realizadas por un empleado en un rango de fechas
    @FXML
    TextField mostrarTareasEmpleadoId;
    @FXML
    DatePicker mostrarTareasEmpleadoFechaInicial;
    @FXML
    DatePicker mostrarTareasEmpleadoFechaFinal;
    @FXML
    private TableView<Tarea> tablaTareas;
    @FXML
    private TableColumn<Tarea, Integer> tareasId;
    @FXML
    private TableColumn<Tarea, String> tareasTarea;
    @FXML
    private TableColumn<Tarea, String> tareasCategoria;
    @FXML
    private TableColumn<Tarea, Date> tareasFecha;
    @FXML
    Button mostrarTareasBoton;
    // Mostrar lista de empleados que han trabajado una tarea bajo una categoría concreta
    @FXML
    TextField mostrarEmpleadosCategoria;
    @FXML
    Button mostrarEmpleadosBoton;
    @FXML
    private TableView<Empleado> tablaEmpleados;
    @FXML
    private TableColumn<Empleado, Integer> empleadosId;
    @FXML
    private TableColumn<Empleado, String> empleadosNombre;
    @FXML
    private TableColumn<Empleado, String> empleadosApellido;
    @FXML
    private TableColumn<Empleado, Integer> empleadosCantidad;


    private ObservableList<Tarea> listaTareas = FXCollections.observableArrayList(
            //new Tarea(1, "Pintar puerta", "pintura", new Date())
    );
    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList(
            //new Empleado(1, "Alexander", "Morales", 3)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Tabla tareas
        tareasId.setCellValueFactory(new PropertyValueFactory<>("tareasId"));
        tareasTarea.setCellValueFactory(new PropertyValueFactory<>("tareasTarea"));
        tareasCategoria.setCellValueFactory(new PropertyValueFactory<>("tareasCategoria"));
        tareasFecha.setCellValueFactory(new PropertyValueFactory<>("tareasFecha"));
        tablaTareas.setItems(listaTareas);

        // Tabla empleados
        empleadosId.setCellValueFactory(new PropertyValueFactory<>("empleadosId"));
        empleadosNombre.setCellValueFactory(new PropertyValueFactory<>("empleadosNombre"));
        empleadosApellido.setCellValueFactory(new PropertyValueFactory<>("empleadosApellido"));
        empleadosCantidad.setCellValueFactory(new PropertyValueFactory<>("empleadosCantidad"));
        tablaEmpleados.setItems(listaEmpleados);

        // Lista de categorías
        /*try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias");
            while(resultSet.next()) {
                registrarTareaCategoria.getItems().add(new MenuItem(resultSet.getString("categoria")));
            }
            connection.close();
        } catch(SQLException e){
            e.printStackTrace();
        }*/

    }
    @FXML
    public void operacionExito(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("La operación ha sido realizada con éxito.");
        alert.showAndWait();
    }
    @FXML
    public void operacionError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Confirmación");
        alert.setHeaderText("La operación ha resultado en un error.");
        alert.showAndWait();
    }
    @FXML
    public void operacionVacio(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Tienes datos vacíos.");
        alert.showAndWait();
    }
    @FXML
    public void registrarEmpleado(){
        if((!registrarEmpleadoNombre.getText().equals(""))&&(!registrarEmpleadoApellido.getText().equals(""))){
            try{
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
                int result;
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO empleados (`nombre`, `apellido`) VALUES (?, ?)");
                preparedStatement.setString(1, registrarEmpleadoNombre.getText());
                preparedStatement.setString(2, registrarEmpleadoApellido.getText());
                result = preparedStatement.executeUpdate();
                registrarEmpleadoNombre.setText("");
                registrarEmpleadoApellido.setText("");
                if(result > 0){
                    operacionExito();
                } else {
                    operacionError();
                }
                connection.close();
            } catch(SQLException e){
                operacionError();
                e.printStackTrace();
            }
        } else {
            operacionVacio();
        }
    }
    @FXML
    public void registrarCategoria(){
        if (!registrarCategoriaInput.getText().equals("")) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
                int result;
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO categorias (`categoria`) VALUES (?)");
                preparedStatement.setString(1, registrarCategoriaInput.getText());
                result = preparedStatement.executeUpdate();
                registrarCategoriaInput.setText("");
                if(result > 0){
                    operacionExito();
                } else {
                    operacionError();
                }
                connection.close();
            } catch(SQLException e){
                operacionError();
                e.printStackTrace();
            }
        } else {
            operacionVacio();
        }
    }
    @FXML
    public void registrarTarea(){
        if((!registrarTareaEmpleadoId.getText().equals(""))&&(!registrarTareaPrecio.getText().equals(""))&&(!registrarTareaInput.getText().equals(""))&&(!registrarTareaCategoriaId.getText().equals(""))){
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
                int result;
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tareas (`id_empleado`, `id_categoria`, `fecha`, `precio`, `tarea`) VALUES (?, ?, ?, ?, ?)");
                preparedStatement.setInt(1, Integer.valueOf(registrarTareaEmpleadoId.getText()));
                preparedStatement.setInt(2, Integer.valueOf(registrarTareaCategoriaId.getText()));
                preparedStatement.setDate(3, new java.sql.Date(new Date().getTime()));
                preparedStatement.setString(4, registrarTareaPrecio.getText());
                preparedStatement.setString(5, registrarTareaInput.getText());
                result = preparedStatement.executeUpdate();
                registrarTareaEmpleadoId.setText("");
                registrarTareaPrecio.setText("");
                registrarTareaInput.setText("");
                registrarTareaCategoriaId.setText("");
                if(result > 0){
                    operacionExito();
                } else {
                    operacionError();
                }
                connection.close();
            } catch(SQLException e){
                operacionError();
                e.printStackTrace();
            }
        } else {
            operacionVacio();
        }
    }
    public void mostrarTareas(){
        if((!mostrarTareasEmpleadoId.getText().equals(""))&&(mostrarTareasEmpleadoFechaInicial.getValue()!=null)&&(mostrarTareasEmpleadoFechaFinal.getValue()!=null)){
            try {
                Date fechaInicial = java.util.Date.from(mostrarTareasEmpleadoFechaInicial.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                Date fechaFinal = java.util.Date.from(mostrarTareasEmpleadoFechaFinal.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
                tablaTareas.getItems().clear();
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT t.id AS Id, t.tarea AS Tarea, c.categoria AS Categoria, t.fecha AS Fecha " +
                        "FROM tareas AS t INNER JOIN categorias AS c ON t.id_categoria = c.id " +
                        "WHERE t.id_empleado = ? AND Fecha >= ? AND Fecha <= ?");
                preparedStatement.setInt(1, Integer.valueOf(mostrarTareasEmpleadoId.getText()));
                preparedStatement.setDate(2, new java.sql.Date(fechaInicial.getTime()));
                preparedStatement.setDate(3, new java.sql.Date(fechaFinal.getTime()));
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    tablaTareas.getItems().add(new Tarea(resultSet.getInt("Id"), resultSet.getString("Tarea"), resultSet.getString("Categoria"), resultSet.getDate("Fecha")));
                }
                mostrarTareasEmpleadoId.setText("");
                mostrarTareasEmpleadoFechaInicial.setValue(null);
                mostrarTareasEmpleadoFechaFinal.setValue(null);
                connection.close();
            } catch (SQLException e){
                operacionError();
                e.printStackTrace();
            }
        } else {
            operacionVacio();
        }

    }
    public void mostrarEmpleados(){
        if(!mostrarEmpleadosCategoria.getText().equals("")){
            try{
                tablaEmpleados.getItems().clear();
                Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TallerMorales", "ae22mp", "Alex22sv");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT e.id as Id, e.nombre AS Nombre, e.apellido AS Apellido, " +
                        "COUNT(e.id) AS Cantidad FROM empleados AS e " +
                        "INNER JOIN tareas AS t ON t.id_empleado = e.id " +
                        "WHERE t.id_categoria = ? " +
                        "GROUP BY Id, Nombre, Apellido " +



                        "ORDER BY Apellido");
                preparedStatement.setInt(1, Integer.valueOf(mostrarEmpleadosCategoria.getText()));
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    tablaEmpleados.getItems().add(new Empleado(resultSet.getInt("Id"), resultSet.getString("Nombre"), resultSet.getString("Apellido"), resultSet.getInt("Cantidad")));
                }
                mostrarEmpleadosCategoria.setText("");
                connection.close();
            } catch(SQLException e){
                operacionError();
                e.printStackTrace();
            }
        } else {
            operacionVacio();
        }
    }

}