package net.bootsfaces.test.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.bootsfaces.test.dao.TestItemDao;
import net.bootsfaces.test.entities.TestItem;

@Named
@ViewScoped
public class UiParamBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private TestItemDao testItemDao;
	
	private TestItem testItem;

	public String onload() {
		testItem = testItemDao.initialise();
		return null;
	}
	
	public TestItem getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItem testItem) {
		this.testItem = testItem;
	}
}
