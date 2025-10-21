package es.vallecidacos.dam2interfacescooperacion2526;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        //Abderrazak Sebbah
        //Modificar Productos
        // Crear los controles
        Label nombreLabel = new Label("Nombre:");
        TextField nombreField = new TextField();

        Label precioLabel = new Label("€/KG:");
        TextField precioField = new TextField();

        Label stockLabel = new Label("Stock:");
        TextField stockField = new TextField();

        Label categoriaLabel = new Label("Categoría:");
        ComboBox<String> categoriaCombo = new ComboBox<>();
        categoriaCombo.getItems().addAll("Frutas", "Verduras", "Carnes", "Lácteos", "Otros");

        CheckBox activoCheck = new CheckBox("Producto activo");

        Button guardarButton = new Button("Guardar");
        guardarButton.setOnAction(e -> {
            String nombre = nombreField.getText();
            double precio = Double.parseDouble(precioField.getText());
            int stock = Integer.parseInt(stockField.getText());
            String categoria = categoriaCombo.getValue();
            boolean activo = activoCheck.isSelected();

            // Aquí podrías guardar los datos en una base de datos o mostrar un resumen
            System.out.println("Producto modificado:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Precio/kg: " + precio);
            System.out.println("Stock: " + stock);
            System.out.println("Categoría: " + categoria);
            System.out.println("Activo: " + activo);
        });

        // Crear el layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Añadir controles al layout
        grid.add(nombreLabel, 0, 0);
        grid.add(nombreField, 1, 0);

        grid.add(precioLabel, 0, 1);
        grid.add(precioField, 1, 1);

        grid.add(stockLabel, 0, 2);
        grid.add(stockField, 1, 2);

        grid.add(categoriaLabel, 0, 3);
        grid.add(categoriaCombo, 1, 3);

        grid.add(activoCheck, 1, 4);

        grid.add(guardarButton, 1, 5);

        // Mostrar la escena
        Scene scene = new Scene(grid, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
