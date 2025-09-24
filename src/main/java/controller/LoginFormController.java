package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    Stage stage = new Stage();
    public void btnStudent(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Student_Management.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnBatch(ActionEvent actionEvent) {
    }

    public void btnGrade(ActionEvent actionEvent) {
    }

    public void btnReport(ActionEvent actionEvent) {
    }
}
