package net.bootsfaces.test.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.bootsfaces.test.dao.TestItemDao;
import net.bootsfaces.test.entities.TestItem;

@Named
@ViewScoped
public class SelectMultiMenuBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private TestItemDao testItemDao;

	private List<TestItem> testItemList;
	private List<Integer> testItemId;

	public void onload() {
		setTestItemList(testItemDao.selectTestItemList());
		testItemId = new ArrayList<>();
		for (TestItem testItem : testItemList) {
			testItemId.add(testItem.getId());
		}
	}

	public List<TestItem> getTestItemList() {
		return testItemList;
	}

	public void setTestItemList(List<TestItem> testItemList) {
		this.testItemList = testItemList;
	}

	public List<Integer> getTestItemId() {
		return testItemId;
	}

	public void setTestItemId(List<Integer> testItemId) {
		this.testItemId = testItemId;
	}
}
