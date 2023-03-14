package eus.ehu.customcell;

import eus.ehu.customcell.domain.Pokemon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;

public class MainController {

    @FXML
    private ListView<Pokemon> pokemonView;


    @FXML
    public void initialize() {
        showList();
    }

    public void showList() {
        List<Pokemon> itemList = getPokemons();

        ObservableList<Pokemon> items = FXCollections.observableList(itemList);

        if (pokemonView != null) {
            pokemonView.setItems(items);
            pokemonView.setCellFactory(param -> {
                var cell =  new PokemonItemCell();
                cell.setOnMouseClicked((evt) -> {
                    Pokemon item = cell.getItem();
                    if (item != null) System.out.println("Pokémon's data: " + item);

                });

                return cell;
            });

        }

    }

    private List<Pokemon> getPokemons() {
        Pokemon ditto = new Pokemon("Ditto", "Limber", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/132.png");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Chlorophyll", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/1.png");
        Pokemon charmander = new Pokemon("Charmander", "Solar-Power", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/4.png");
        return List.of(ditto, bulbasaur, charmander);
    }

}
