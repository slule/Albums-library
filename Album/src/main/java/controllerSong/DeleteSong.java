package controllerSong;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Song;

/**
 * Servlet implementation class DeleteSong
 */
@WebServlet("/DeleteSong")
public class DeleteSong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSong() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SongHelper helper = new SongHelper();
		String songName = request.getParameter("songName");
		Song deleteable = helper.searchSongByName(songName);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/DeleteSong.jsp").forward(request, response);
	}

}
