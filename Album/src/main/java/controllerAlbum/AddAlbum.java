package controllerAlbum;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Album;


@WebServlet("/AddAlbum")
public class AddAlbum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAlbum() {
        super();
        

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Album x = new Album();
		AlbumHelper helper = new AlbumHelper();
		x.setAlbumName(request.getParameter("albumName"));
		x.setYearReleased (Integer.parseInt(request.getParameter("yearReleased")));
		helper.persist(x);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		
		
	}

}
