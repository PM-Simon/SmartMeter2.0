package de.tub.as.smm;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.tub.as.smm.dao.SmartMeterDao;
import de.tub.as.smm.models.SmartMeter;

@WebServlet("/übersicht")
public class ÜbersichtServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	SmartMeterDao sm;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("sm", sm.getAllSmartMeter());
		request.getRequestDispatcher("/Übersicht.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String kennung = request.getParameter("kennung");
		String maxStärke = request.getParameter("maxStaerke");

		sm.persist(new SmartMeter(kennung, maxStärke));

		doGet(request, response);
	}

}
