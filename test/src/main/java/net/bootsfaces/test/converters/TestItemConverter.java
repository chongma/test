package net.bootsfaces.test.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import net.bootsfaces.test.beans.ConverterBean;
import net.bootsfaces.test.entities.TestItem;

@FacesConverter(value = "testItemConverter")
public class TestItemConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 != null && arg2.matches("[0-9]+")) {
			int id = Integer.parseInt(arg2);
			ConverterBean converterBean = arg0.getApplication().evaluateExpressionGet(arg0, "#{converterBean}",
					ConverterBean.class);
			for (TestItem testItem : converterBean.getTestItemList()) {
				if (testItem.getId() == id) {
					return testItem;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 instanceof TestItem) {
			return String.valueOf(((TestItem) arg2).getId());
		}
		return null;
	}

}
