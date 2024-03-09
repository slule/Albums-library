package controllerSong;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Song;

/**
 * Servlet implementation class ViewSong
 */
@WebServlet("/ViewSong")
public class ViewSong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSong() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SongHelper helper = new SongHelper();
		List<Song> songList = helper.showAllSong();
		request.setAttribute("songList", songList);
		
		
		getServletContext().getRequestDispatcher("/ViewSong.jsp").forward(request, response);
	}

}
