package eus.ehu.customcell;

import eus.ehu.customcell.domain.Teacher;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class TeacherItemCell extends ListCell<Teacher> {

    private FXMLLoader mLLoader;

    @FXML
    private AnchorPane listItem;

    @FXML
    private Label email;

    @FXML
    private Label name;

    @FXML
    private ImageView picture;

    @Override
    protected void updateItem(Teacher item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setGraphic(null);
            setText(null);

            return;
        }

        if (mLLoader == null) {
            mLLoader = new FXMLLoader(getClass().getResource("teacher.fxml"));
            mLLoader.setController(this);
            try {
                mLLoader.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        name.setText(item.getName());
        email.setText(item.getEmail());
        picture.setImage(new Image(item.getPicture()));

        setText(null);
        setGraphic(listItem);
    }
}
