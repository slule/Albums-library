/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 6, 2024 
*/ 
package model;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	
	
	@Entity 
	@Table(name="song")
	public class Song {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private int songId;
		private String songName;
		private String artistName;
		@ManyToOne
		@JoinColumn(name="albumId", nullable = false)
		private Album album = new Album(); 

		
		
		public Album getAlbum() {
			return album;
		}

		
		public void setAlbum(Album album) {
			this.album = album;
		}

		public int getSongId() {
			return songId;
		}
		
		public void setSongId(int songId) {
			this.songId = songId;
		}
		
		public String getSongName() {
			return songName;
		}
		
		public void setSongName(String songName) {
			this.songName = songName;
		}
		
		public String getArtistName() {
			return artistName;
		}
	
		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}
	

}
