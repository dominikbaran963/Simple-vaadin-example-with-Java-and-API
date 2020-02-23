package pl.baran.vaadin.model;

public class Pokemon{
	
	private String name;
	private PokemonType pokemontype;
	private String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PokemonType getPokemontype() {
		return pokemontype;
	}
	public void setPokemontype(PokemonType pokemontype) {
		this.pokemontype = pokemontype;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}