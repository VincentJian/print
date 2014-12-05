package org.zkoss.print.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MortgageAnalysis {

	private String _analysis;
	private String _current;
	private String _proposed;

	public MortgageAnalysis(String analysis, String current, String proposed) {
		_analysis = analysis;
		_current = current;
		_proposed = proposed;
	}

	public String getAnalysis() {
		return _analysis;
	}

	public void setAnalysis(String analysis) {
		_analysis = analysis;
	}

	public String getCurrent() {
		return _current;
	}

	public void setCurrent(String current) {
		_current = current;
	}

	public String getProposed() {
		return _proposed;
	}

	public void setProposed(String proposed) {
		_proposed = proposed;
	}

	private static List<MortgageAnalysis> analyses = new ArrayList<MortgageAnalysis>();

	public static List<MortgageAnalysis> getMortgageAnalyses() {
		if (analyses.isEmpty()) {
			analyses.addAll(Arrays.asList(new MortgageAnalysis[] {
				new MortgageAnalysis("Mortgage Amount", "$101,308.00", "$101,308.00"),
				new MortgageAnalysis("Mortgage Payment", "$859.35", "$699.61"),
				new MortgageAnalysis("Months to Recover Refinancing Costs", "", "15.65111065"),
				new MortgageAnalysis("Mortgage Balance at Re-Sale", "$66,722.86", "$72,453.30"),
				new MortgageAnalysis("Principal Repaid to Re-Sale", "$34,585.14", "$28,854.70"),
				new MortgageAnalysis("Total Payments to Re-Sale", "$51,560.85", "$41,976.87"),
				new MortgageAnalysis("Total Interest to Re-Sale", "$16,975.71", "$13,122.17"),
				new MortgageAnalysis("Tax Deduction on Interest", "$1,018.54", "$787.33"),
				new MortgageAnalysis("Net Interest Cost to Re-Sale", "$15,951.17", "$12,334.84"),
				new MortgageAnalysis("Interest Savings (Costs)", "", "$3,622.33"),
				new MortgageAnalysis("Total Savings (Costs)", "", "$1,122.33") }));
		}
		return analyses;
	}
}
