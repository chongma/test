package net.bootsfaces.test.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.bootsfaces.test.dao.TestItemDao;
import net.bootsfaces.test.entities.TestItem;

@Named
@ViewScoped
public class SelectOneBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private TestItemDao testItemDao;

	private List<TestItem> testItemList;
	private String testItemValue;

	public void onload() {
		setTestItemValue("NOT SET");
		setTestItemList(testItemDao.selectTestItemList());
	}

	public List<TestItem> getTestItemList() {
		return testItemList;
	}

	public void setTestItemList(List<TestItem> testItemList) {
		this.testItemList = testItemList;
	}

	public String getTestItemValue() {
		return testItemValue;
	}

	public void setTestItemValue(String testItemValue) {
		this.testItemValue = testItemValue;
	}
}
