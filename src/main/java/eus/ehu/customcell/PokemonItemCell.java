package eus.ehu.customcell;

import eus.ehu.customcell.domain.Pokemon;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PokemonItemCell extends ListCell<Pokemon> {

    private FXMLLoader loader;

    @FXML
    private AnchorPane listItem;

    @FXML
    private Label ability;

    @FXML
    private Label name;

    @FXML
    private ImageView picture;

    @Override
    protected void updateItem(Pokemon item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setGraphic(null);
            setText(null);

            return;
        }

        if (loader == null) {
            loader = new FXMLLoader(getClass().getResource("pokemon.fxml"));
            loader.setController(this);
            try {
                loader.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        name.setText(item.getName());
        ability.setText(item.getAbility());
        picture.setImage(new Image(item.getPicture()));

        setText(null);
        setGraphic(listItem);
    }
}
