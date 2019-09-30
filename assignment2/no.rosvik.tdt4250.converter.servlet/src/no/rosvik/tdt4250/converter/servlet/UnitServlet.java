package no.rosvik.tdt4250.converter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

import no.rosvik.tdt4250.converter.api.Unit;
import no.rosvik.tdt4250.converter.api.UnitSearch;
import no.rosvik.tdt4250.converter.api.UnitSearchResult;

@Component
@HttpWhiteboardServletPattern("/unit/*")
public class UnitServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	private UnitSearch unitSearch = new UnitSearch();

	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConversion",
			unbind = "removeConversion"
	)
	public void addConversion(Unit unit) {
		unitSearch.addConversion(unit);
	}
	public void removeConversion(Unit unit) {
		unitSearch.removeConversion(unit);
	}

	@Reference(cardinality = ReferenceCardinality.OPTIONAL)
	private volatile LoggerFactory loggerFactory;
	
	private Logger getLogger() {
		if (loggerFactory != null) {
			return loggerFactory.getLogger(UnitServlet.class);
		}
		return null;
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> segments = new ArrayList<>();
		String path = request.getPathInfo();
		Logger logger = getLogger();
		logger.info("Received request for " + path);

		if (path != null) {
			segments.addAll(Arrays.asList(path.split("\\/")));
		}
		if (segments.size() > 0 && segments.get(0).length() == 0) {
			segments.remove(0);
		}
		
		if (segments.size() > 1) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, "Request must contain max 1 path segment");
			return;
		}
		
		String q = request.getParameter("q");
		UnitSearchResult result = unitSearch.search(segments.get(0), q);

		logger.info("Conversion " + (result.isSuccess() ? "succeeded" : "failed"));
		
		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		if (result.getLink() != null) {
			writer.print(result.getLink());
		}
		writer.print(result.getMessage());
	}
}