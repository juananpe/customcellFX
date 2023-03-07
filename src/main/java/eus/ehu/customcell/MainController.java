package eus.ehu.customcell;

import eus.ehu.customcell.domain.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.List;

public class HelloController {

    @FXML
    private ListView<Teacher> teachersView;

    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

    public void showList() {
        List<Teacher> itemList = getTeachers();

        ObservableList<Teacher> items = FXCollections.observableList(itemList);

        if (teachersView != null) {
            teachersView.setItems(items);
            teachersView.setCellFactory(param -> {
                var cell =  new TeacherItemCell();
                cell.setOnMouseClicked((evt) -> {
                    Teacher item = cell.getItem();
                    if (item != null) System.out.println("Show teacher's data " + item.toString());

                });

                return cell;
            });

        }

    }

    private List<Teacher> getTeachers() {
        return null;
    }

}
