package com.vaadin.trainings.intro;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.trainings.intro.serverside.ExampleTemplate;
import com.vaadin.trainings.service.CustomerService;

import artix.ru.customer.samples.backend.model.Customer;
import artix.ru.customer.samples.backend.service.ICustomerService;

@Route("")
@Theme(Lumo.class)
@BodySize(height = "100vh", width = "100vw")
public class MainView extends VerticalLayout {

	public MainView() {
		setMargin(true);
		//g.getColumnByKey("id").setFrozen(true);
		//g.setDataProvider(ldc);
		
		
//		add(new VaadinWelcome());
//        final Button button = new Button("Click me!");
//        add(button);
//        button.addClickListener(e -> add(new Paragraph("added from button!")));
//        add(new ExampleTemplate());
	}
}