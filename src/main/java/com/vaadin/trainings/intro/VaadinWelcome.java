package com.vaadin.trainings.intro;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;

public class VaadinWelcome extends Composite<Div> implements HasComponents {

	private static final long serialVersionUID = 1L;
	
	public VaadinWelcome() {
		add(new Image("hero-reindeer.svg", "vaadin"));
		add(new Paragraph("Hello"));
	}
}