package pl.baran.vaadin;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import pl.baran.vaadin.model.Pokemon;

@SuppressWarnings("serial")
@Route
public class PokemonDeckGUI extends VerticalLayout {

	@Autowired
	public PokemonDeckGUI(PokemonDeck pokemondeck) {
		Grid<Pokemon> grid = new Grid<>(Pokemon.class);
		grid.setItems(pokemondeck.getPokemons());
		grid.removeColumnByKey("image");
		grid.addComponentColumn(pokemon -> new Image(pokemon.getImage() , pokemon.getName())).setHeader("Image ");
		add(grid);
	}
	
}
