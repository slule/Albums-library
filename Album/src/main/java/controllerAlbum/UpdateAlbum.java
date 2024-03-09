package controllerAlbum;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Album;


/**
 * Servlet implementation class UpdateAlbum
 */
@WebServlet("/UpdateAlbum")
public class UpdateAlbum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAlbum() {
        super();
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AlbumHelper helper = new AlbumHelper ();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("newName");
		int yearReleased = Integer.parseInt(request.getParameter("yearReleased"));

		
		Album albumToUpdate = helper.searchAlbumByName(oldName);
		albumToUpdate.setAlbumName(name);
		albumToUpdate.setYearReleased(yearReleased);
		helper.update(albumToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
