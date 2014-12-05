package org.zkoss.print;

import org.zkoss.bind.annotation.Init;
import org.zkoss.chart.Exporting;
import org.zkoss.chart.Legend;
import org.zkoss.chart.model.DefaultSingleValueCategoryModel;
import org.zkoss.chart.model.SingleValueCategoryModel;
import org.zkoss.chart.plotOptions.PiePlotOptions;
import org.zkoss.chart.plotOptions.PlotOptions;
import org.zkoss.print.data.LineItem;
import org.zkoss.zul.ListModelList;

public class RatioVM {

	private SingleValueCategoryModel chartDataModel = new DefaultSingleValueCategoryModel();
	private Legend chartLegend = new Legend();
	private PlotOptions chartOptions = new PlotOptions();
	private Exporting chartExporting = new Exporting();
	private ListModelList<LineItem> gridDataModel = new ListModelList<LineItem>(LineItem.getLineItems());

	@Init
	public void init() {
		chartDataModel.setValue("assets", 153000);
		chartDataModel.setValue("equity", 28000);
		chartDataModel.setValue("liabilities", 125000);

		chartLegend.setEnabled(true);
		chartLegend.setFloating(true);
		chartLegend.setAlign("right");
		chartLegend.setLayout("vertical");
		chartLegend.setVerticalAlign("middle");
		
		PiePlotOptions pieOptions = chartOptions.getPie();
		pieOptions.getDataLabels().setEnabled(false);
		pieOptions.setShowInLegend(true);
		pieOptions.getTooltip().setPointFormat("{point.y}, {point.percentage:.1f}%");
		
		chartExporting.setEnabled(false);
	}

	public SingleValueCategoryModel getChartDataModel() {
		return chartDataModel;
	}

	public Legend getChartLegend() {
		return chartLegend;
	}

	public PlotOptions getChartOptions() {
		return chartOptions;
	}

	public Exporting getChartExporting() {
		return chartExporting;
	}

	public ListModelList<LineItem> getGridDataModel() {
		return gridDataModel;
	}

}
