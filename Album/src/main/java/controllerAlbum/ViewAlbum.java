package controllerAlbum;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Album;


/**
 * Servlet implementation class ViewAlbum
 */
@WebServlet("/ViewAlbum")
public class ViewAlbum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAlbum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	AlbumHelper helper = new AlbumHelper();
	List<Album> albumList = helper.showAllalbum();
	request.setAttribute("allAlbum",  albumList);
	
	getServletContext().getRequestDispatcher("/ViewAlbum.jsp").forward(request,  response);
	}

}
