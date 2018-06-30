package com.vaadin.trainings.intro.clientside;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Описание модели веб-компонента на сервере
 * @author uev
 */
public interface ExampleModel extends TemplateModel {
	
	void setValue(String value);
	String getValue();

}
