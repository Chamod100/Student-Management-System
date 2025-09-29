package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentManagementController {
    Stage stage = new Stage();
    public void btnAddStudent(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Add Student.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        stage.show();
    }
    public void btnUpdateStudent(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UpdateStudent.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnViewStudent(ActionEvent actionEvent) {
    }

    public void btnDeleteStudent(ActionEvent actionEvent) {


    }
}
