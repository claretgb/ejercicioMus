package com.example.myapplication;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class TapeteForm extends FormLayout {
	final TextField carta1 = new TextField("Carta 1:");
	final TextField carta2 = new TextField("Carta 2:");
	final TextField carta3 = new TextField("Carta 3:");
	final TextField carta4 = new TextField("Carta 4:");
	
	private MyUI myui;
	
	public TapeteForm(MyUI myui) {
		this.myui = myui;
		
		addComponents(carta1, carta2, carta3, carta4);
	}
}
