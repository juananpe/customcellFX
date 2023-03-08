package eus.ehu.customcell;

import eus.ehu.customcell.domain.Teacher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;

public class MainController {

    @FXML
    private ListView<Teacher> teachersView;


    @FXML
    public void initialize() {
        showList();
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
        Teacher juanan = new Teacher("Juanan Pereira", "juanan.pereira@ehu.eus", "https://gestion-alumnos.ehu.es/tmp/273496_20230307155712884.jpg");
        Teacher usue = new Teacher("Usue Mori", "usue.mori@ehu.eus", "https://gestion-alumnos.ehu.es/tmp/314714_20230307155956841.jpg");
        Teacher javierdolado = new Teacher("Javier Dolado", "javier.dolado@ehu.eus", "https://gestion-alumnos.ehu.es/tmp/3647_20230307160023681.jpg");
        return List.of(juanan, usue, javierdolado);
    }

}
