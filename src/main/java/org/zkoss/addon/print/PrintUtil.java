package org.zkoss.addon.print;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.Clients;

public class PrintUtil {

	/**
	 * The specific component to print
	 * @param comp any ZK component
	 */
	public static void print(Component comp) {
		print(comp, Executions.encodeURL("~./js/print/template.zul"), null);
	}

	/**
	 * The specific component to print with custom print CSS style or template ZUL page
	 * @param comp any ZK component
	 * @param cssuri the path to the CSS file
	 */
	public static void print(Component comp, String cssuri) {
		print(comp, Executions.encodeURL("~./js/print/template.zul"), cssuri);
	}

	/**
	 * The specific component to print with custom print CSS style and template ZUL page
	 * @param comp any ZK component
	 * @param uri the path to the template ZUL page
	 * @param cssuri the path to the CSS file
	 */
	public static void print(Component comp, String uri, String cssuri) {
		String script = "zk.print('" + comp.getUuid() + "', '" + uri + "'";
		if (cssuri != null) {
			if (uri.contains("zkau") && !cssuri.startsWith("/"))
				cssuri = "/" + cssuri; //absolute path if using default template.zul within jar file
			script += ", '" + cssuri + "');";
		} else {
			script += ");";
		}
		Clients.evalJavaScript(script);
	}
}
