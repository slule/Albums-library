/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 6, 2024 
*/ 
package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="album")
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int albumId;
	private String albumName;
	int yearReleased;
	@OneToMany(mappedBy= "album", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Song> song;
	
	
	
	public List<Song> getSong() {
		return song;
	}

	
	public void setSong(List<Song> song) {
		this.song = song;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
		
}

