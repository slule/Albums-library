package controllerSong;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Song;

/**
 * Servlet implementation class UpdateSong
 */
@WebServlet("/UpdateSong")
public class UpdateSong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSong() {
        super();
        
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SongHelper helper = new SongHelper();
		
		String oldName = request.getParameter("oldName");
		String songName = request.getParameter("songName");
		String artistName = request.getParameter("artistName");
		
		Song songToUpdate = helper.searchSongByName(oldName);
		songToUpdate.setSongName(songName);
		songToUpdate.setArtistName(artistName);
		
		helper.update(songToUpdate);
		
		getServletContext().getRequestDispatcher("/UpdateSong.jsp").forward(request, response);
	}

}
