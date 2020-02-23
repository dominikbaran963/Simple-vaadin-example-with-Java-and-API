package pl.baran.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@SuppressWarnings("serial")
@Route("hello")
@StyleSheet("/css/style.css")
public class HelloGui extends VerticalLayout {

	public HelloGui() {
		TextField TextFieldName = new TextField("Podaj imie");
		Button ButtonName = new Button("Zatwierdz");
		Label LabelName = new Label();
		ButtonName.addClickListener( ClickEvent -> {
			add(new Image("https://tapetuj.pl/media/products/801017fe7d41f0e8147ec5c7a9e9bba1/images/thumbnail/large_104029.jpg?lm=1560445589", "nie udało się wczytać"));
			LabelName.setText("Hellow " + TextFieldName.getValue());
		});
		add(TextFieldName , ButtonName , LabelName);
		
	}

}
