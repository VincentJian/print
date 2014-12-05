package org.zkoss.print.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MortgageItem {

	private String _itemName;
	private String _value;

	public MortgageItem(String itemName, String value) {
		_itemName = itemName;
		_value = value;
	}

	public String getItemName() {
		return _itemName;
	}

	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	public String getValue() {
		return _value;
	}

	public void setValue(String value) {
		_value = value;
	}

	private static Map<String, List<MortgageItem>> items = new TreeMap<String, List<MortgageItem>>();

	public static Map<String, List<MortgageItem>> getMortgageItems() {
		if (items.isEmpty()) {
			items.put("A - Personal",
				Arrays.asList(new MortgageItem[] {
					new MortgageItem("Marginal Tax Rate", "6%"),
					new MortgageItem("Resale Plan (Months)", "60") }));
			items.put("B - Mortgage Items",
				Arrays.asList(new MortgageItem[] {
					new MortgageItem("Original Mortgage Amount", "180000"),
					new MortgageItem("Current Mortgage Rate", "4%"),
					new MortgageItem("Original Term (Years)", "30"),
					new MortgageItem("Months Paid", "210"),
					new MortgageItem("New Mortgage Rate", "3%"),
					new MortgageItem("New Term (Years)", "15"),
					new MortgageItem("Points", "0")}));
			items.put("C - Refinancing Fees",
				Arrays.asList(new MortgageItem[] {
					new MortgageItem("Application", "200"),
					new MortgageItem("Title", "2000"),
					new MortgageItem("Legal", "200"),
					new MortgageItem("Other", "100"),
					new MortgageItem("Points", "0"),
					new MortgageItem("Total Fees", "2500")}));
		}
		return items;
	}
}
