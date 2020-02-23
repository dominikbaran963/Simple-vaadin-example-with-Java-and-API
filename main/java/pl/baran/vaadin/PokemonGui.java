package pl.baran.vaadin;

import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import pl.baran.vaadin.model.Pokemon;
import pl.baran.vaadin.model.PokemonType;
import pl.baran.vaadin.PokemonDeck;

@SuppressWarnings("serial")
@Route("pokemon")
public class PokemonGui extends VerticalLayout {
	
	
	@Autowired
	public PokemonGui(PokemonDeck pokemonDeck ) {
		TextField textFieldName = new TextField("name");
		TextField textFieldImage = new TextField("image");
		ComboBox<PokemonType> pokemonTypeComboBox = new ComboBox<>("Pokemon Typ: ",PokemonType.values());
		
		com.vaadin.flow.component.button.Button addPokemon = new com.vaadin.flow.component.button.Button("Dodaj Pokemona");
		addPokemon.addClickListener(clikEvent -> {
			Pokemon pokemon = new Pokemon();
			pokemon.setName(textFieldName.getValue());
			pokemon.setImage(textFieldImage.getValue());
			pokemon.setPokemontype(pokemonTypeComboBox.getValue());
			pokemonDeck.getPokemons().add(pokemon);
			Notification notification = new Notification("Dodano Pokemona" , 2000);
			notification.open();
		});
		add(textFieldName,textFieldImage,pokemonTypeComboBox,addPokemon);
		
	}
	
}
