package pl.baran.vaadin;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import pl.baran.vaadin.model.Pokemon;



@Repository
public class PokemonDeck {
	private ArrayList<Pokemon> pokemons;
	public PokemonDeck() {
		this.pokemons = new ArrayList<>();
	}
	public ArrayList<Pokemon> getPokemons() {
		return pokemons;
	}
	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
}
