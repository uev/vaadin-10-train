package com.vaadin.trainings.intro.serverside;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.trainings.intro.clientside.ExampleModel;

/**
 * Обработка  поведения веб-компонента на сервере
 * @author uev
 *
 */
@Tag("example-template")
@HtmlImport("example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleModel> {
	@EventHandler
	private void handleClick() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getModel().setValue("Server Message"); // передача значения в шаблон
	}
}