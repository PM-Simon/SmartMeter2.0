package de.tub.as.smm;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.tub.as.smm.dao.SmartMeterDao;
import de.tub.as.smm.dao.UserDao;
import de.tub.as.smm.models.SmartMeter;
import de.tub.as.smm.models.User;

@WebServlet("/�bersicht")
public class �bersichtServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB
	SmartMeterDao sm;
	
	@EJB
	UserDao u;
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("sm", sm.getAllSmartMeter());
		request.getRequestDispatcher("/�bersicht.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getParameter("kennung") != null){
		String kennung = request.getParameter("kennung");
		String maxSt�rke = request.getParameter("maxStaerke");
		sm.persist(new SmartMeter(kennung, maxSt�rke));
		System.out.println("sm");
		
		}else if(request.getParameter("name") != null){
			String name = request.getParameter("name");
			String passwort = request.getParameter("passwort");
			u.anmelden();
			u.persist(new User(name,passwort));
			request.setAttribute("angemeldet", u.istAngemeldet());
			
		}
		
		
		doGet(request, response);
	}

}
