package org.alexsv.editorarchivos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;

public class HelloController {
    @FXML
    private TextArea textContent;
    @FXML
    private TextField fileName;

    private File file;

    public void createFile(){
        String name = fileName.getText();
        try{
            if(name.isEmpty()){
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Crear un nuevo archivo.");
                fileChooser.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("Archivos de texto", "*.txt"),
                        new FileChooser.ExtensionFilter("Todos los archivos", "*.*")
                );
                file = fileChooser.showSaveDialog(new Stage());
                fileName.setText(file.getName());
            } else {
                if(file.getName().equals(fileName.getText())){
                    FileWriter writer = new FileWriter(file, false);
                    writer.write(textContent.getText()+"\n");
                    writer.close();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Saved file.");
                    alert.setTitle("File reader");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                    //System.out.println(file.getParent());
                } else {
                    File newFile = new File(file.getParent()+"/"+fileName.getText());
                    FileWriter writer = new FileWriter(newFile, false);
                    writer.write(textContent.getText()+"\n");
                    writer.close();
                    file.delete();
                    file = newFile;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Renamed file.");
                    alert.setTitle("File reader");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void openFile(){
        textContent.clear();
        fileName.clear();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccione un archivo.");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Archivos de texto", "*.txt"),
                new FileChooser.ExtensionFilter("Todos los archivos", "*.*")
        );
        file = fileChooser.showOpenDialog(new Stage());
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            fileName.setText(file.getName());
            String line;
            while((line= bufferedReader.readLine()) != null){
                textContent.appendText(line + "\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void closeFile(){
        textContent.clear();
        fileName.clear();
        file = null;
    }
}