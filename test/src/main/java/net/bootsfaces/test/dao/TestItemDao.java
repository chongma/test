package net.bootsfaces.test.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import net.bootsfaces.test.entities.TestItem;

@ApplicationScoped
public class TestItemDao {

	public List<TestItem> selectTestItemList() {
		List<TestItem> testItemList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			testItemList.add(createTestItem(i, "ITEM " + i));
		return testItemList;
	}

	public TestItem initialise() {
		return createTestItem(1, "Test item");
	}

	private TestItem createTestItem(int id, String value) {
		TestItem testItem = new TestItem();
		testItem.setId(id);
		testItem.setValue(value);
		return testItem;
	}

}
