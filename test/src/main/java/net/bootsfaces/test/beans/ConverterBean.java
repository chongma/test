package net.bootsfaces.test.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.bootsfaces.test.dao.TestItemDao;
import net.bootsfaces.test.entities.TestItem;

@Named
@ViewScoped
public class ConverterBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private TestItemDao testItemDao;

	private List<TestItem> testItemList;
	private TestItem testItem1;
	private TestItem testItem2;
	private TestItem testItem3;

	public String onload() {
		testItemList = testItemDao.selectTestItemList();
		return null;
	}

	public void ajaxListener(AjaxBehaviorEvent event) {
		System.out.println("Selected item 1: " + testItem1.getValue());
	}

	public void onChange() {
		System.out.println("Selected item 2: " + testItem2.getValue());
	}

	public List<TestItem> getTestItemList() {
		return testItemList;
	}

	public void setTestItemList(List<TestItem> testItemList) {
		this.testItemList = testItemList;
	}

	public TestItem getTestItem1() {
		return testItem1;
	}

	public void setTestItem1(TestItem testItem1) {
		this.testItem1 = testItem1;
	}

	public TestItem getTestItem2() {
		return testItem2;
	}

	public void setTestItem2(TestItem testItem2) {
		this.testItem2 = testItem2;
	}

	public TestItem getTestItem3() {
		return testItem3;
	}

	public void setTestItem3(TestItem testItem3) {
		this.testItem3 = testItem3;
	}

}
