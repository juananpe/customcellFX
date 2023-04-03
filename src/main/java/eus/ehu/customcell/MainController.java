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
        Pokemon pikachu = new Pokemon("Pikachu", "Static", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/25.png");
        Pokemon squirtle = new Pokemon("Squirtle", "Torrent", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/7.png");
        Pokemon snorlax = new Pokemon("Snorlax", "Immunity", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/143.png");
        Pokemon mew = new Pokemon("Mew", "Synchronize", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/151.png");
        Pokemon mewtwo = new Pokemon("Mewtwo", "Pressure", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/150.png");
        Pokemon eevee = new Pokemon("Eevee", "Adaptability", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/133.png");
        Pokemon jigglypuff = new Pokemon("Jigglypuff", "Cute Charm", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/39.png");
        Pokemon meowth = new Pokemon("Meowth", "Pickup", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/52.png");
        Pokemon psyduck = new Pokemon("Psyduck", "Damp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/54.png");
        Pokemon gastly = new Pokemon("Gastly", "Levitate", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/shiny/92.png");
        return List.of(ditto, bulbasaur, charmander, pikachu,squirtle, snorlax, mew, mewtwo, eevee, jigglypuff, meowth, psyduck, gastly);
    }

}
