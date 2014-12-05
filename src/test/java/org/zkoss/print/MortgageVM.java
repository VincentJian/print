package org.zkoss.print;

import java.util.List;
import java.util.Map;

import org.zkoss.print.data.MortgageAnalysis;
import org.zkoss.print.data.MortgageItem;
import org.zkoss.zul.ListModelList;

public class MortgageVM {

	private Map<String, List<MortgageItem>> mortgageItems = MortgageItem.getMortgageItems();
	private ListModelList<MortgageAnalysis> mortgageAanlyses = new ListModelList<MortgageAnalysis>(MortgageAnalysis.getMortgageAnalyses());

	public Map<String, List<MortgageItem>> getMortgageItems() {
		return mortgageItems;
	}

	public ListModelList<MortgageAnalysis> getMortgageAanlyses() {
		return mortgageAanlyses;
	}

}
