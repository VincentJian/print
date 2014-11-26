package org.zkoss.print.data;

import java.util.ArrayList;
import java.util.List;

public class LineItem {

	private String _itemName;
	private Number _q1, _q2, _q3, _q4, _annual;

	public LineItem(String itemName, Number q1, Number q2, Number q3, Number q4,
			Number annual) {
		_itemName = itemName;
		_q1 = q1;
		_q2 = q2;
		_q3 = q3;
		_q4 = q4;
		_annual = annual;
	}

	public String getItemName() {
		return _itemName;
	}

	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	public Number getQ1() {
		return _q1;
	}

	public void setQ1(Number q1) {
		_q1 = q1;
	}

	public Number getQ2() {
		return _q2;
	}

	public void setQ2(Number q2) {
		_q2 = q2;
	}

	public Number getQ3() {
		return _q3;
	}

	public void setQ3(Number q3) {
		_q3 = q3;
	}

	public Number getQ4() {
		return _q4;
	}

	public void setQ4(Number q4) {
		_q4 = q4;
	}

	public Number getAnnual() {
		return _annual;
	}

	public void setAnnual(Number annual) {
		_annual = annual;
	}

	private static List<LineItem> items = new ArrayList<LineItem>();
	public static List<LineItem> getLineItems() {
		if (items.isEmpty()) {
			items.add(new LineItem("Current assets", 45000, 46000, 46500, 48000, 48000));
			items.add(new LineItem("Fixed assets", 80000, 80000, 90000, 105000, 105000));
			items.add(new LineItem("Total assets", 125000, 126000, 136500, 153000, 153000));
			items.add(new LineItem("Average total assets", 122500, 123000, 128250, 136500, 136500));
			items.add(new LineItem("Cash and cash equivalents", 15000, 18000, 16500, 14350, 14350));
			items.add(new LineItem("Invetory", 15000, 18000, 16500, 14350, 14350));
			items.add(new LineItem("Average inventory", 13750, 15250, 14500, 13425, 13425));
			items.add(new LineItem("Current liabilities", 23000, 25000, 22500, 25600, 25600));
			items.add(new LineItem("Total liabilities", 125000, 125000, 125000, 125000, 125000));
			items.add(new LineItem("Owners' equity", 28000, 30900, 32000, 28000, 28000));
			items.add(new LineItem("Number of common shares", 25000, 25000, 25000, 25000, 25000));
			items.add(new LineItem("Average number of common shares", 25000, 25000, 25000, 25000, 25000));
			items.add(new LineItem("Average owners' equity", 28500, 29950, 30500, 28500, 28500));
			items.add(new LineItem("Market price per share", 10, 10, 10, 10, 10));
			items.add(new LineItem("Cash flow", 175000, 186000, 169000, 155000, 685000));
			items.add(new LineItem("Cash flow per share", 7, 7.44, 6.76, 6.2, 27.4));
			items.add(new LineItem("Dividends paid", 5000, 5000, 5000, 5000, 20000));
			items.add(new LineItem("Total sales", 145000, 156000, 135600, 125000, 561600));
			items.add(new LineItem("Operating expenses", 77000, 88000, 67600, 57000, 289600));
			items.add(new LineItem("Advertising expense", 18000, 18000, 18000, 18000, 72000));
			items.add(new LineItem("Marketing expense", 11000, 11000, 11000, 11000, 44000));
			items.add(new LineItem("Earnings before interest and taxes", 132000, 127000, 114500, 98000, 471500));
			items.add(new LineItem("Interest expense", 24000, 24000, 24000, 24000, 96000));
			items.add(new LineItem("Net income", 89000, 87000, 95000, 65000, 336000));
			items.add(new LineItem("Total loan", 25000, 24000, 23000, 22000, 22000));
			items.add(new LineItem("Value of collateral or property", 65000, 65000, 65000, 65000, 65000));
		}
		return items;
	}
}
