package org.zkoss.print;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.zkoss.addon.print.PrintUtil;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.WebApps;

public class PrintVM {

	private String reportTitle;
	private String src;
	private String templateContent;

	@Command
	@NotifyChange({"reportTitle", "src"})
	public void loadReport(@BindingParam("name") String title) {
		if (title.toLowerCase().contains("ratio")) {
			src = "report/ratio.zul";
		} else if (title.toLowerCase().contains("mortgage")) {
			src = "report/mortgage.zul";
		}
		reportTitle = title;
		generateTemplate();
	}

	@Command
	public void print(@BindingParam("comp") Component comp) {
		PrintUtil.print(comp, "print/newTemplate.zul", "/css/print.css");
	}

	private void generateTemplate() {
		if (templateContent == null) {
			File template = new File(WebApps.getCurrent().getRealPath("/print/template.zul"));
			try {
				templateContent = FileUtils.readFileToString(template);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File newTemplate = new File(WebApps.getCurrent().getRealPath("/print/newTemplate.zul"));
		try {
			String content = templateContent.replace("$titleName", reportTitle);
			if (!newTemplate.exists()) {
				newTemplate.createNewFile();
			}
			FileUtils.writeStringToFile(newTemplate, content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public String getSrc() {
		return src;
	}

}
