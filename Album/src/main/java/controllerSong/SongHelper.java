/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 8, 2024 
*/ 
package controllerSong;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import controllerAlbum.AlbumHelper;
import model.Album;
import model.Song;



public class SongHelper {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Album");
		AlbumHelper albumHelper = new AlbumHelper();
		
		public void persist(Song model) {
			
			model.setAlbum(albumHelper.searchAlbumByName(model.getAlbum().getAlbumName()));
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(model);
			manager.getTransaction().commit();
			manager.close();

}
		public void delete(Song model) {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.remove(manager.find(Song.class, model.getSongId()));
			manager.getTransaction().commit();
			manager.close();
			
		}
		@SuppressWarnings("unchecked")
		public List<Song> showAllSong() {
			EntityManager manager = factory.createEntityManager();
			List<Song> allItems = manager.createQuery("SELECT i FROM Song i").getResultList();
			manager.close();
			return allItems;
		}

		public void update(Song model) {
			EntityManager manager = factory.createEntityManager();
			Song dbEntity = manager.find(Song.class, model.getSongId());
			manager.getTransaction().begin();
			dbEntity.setSongName(model.getSongName());
			dbEntity.setArtistName(model.getArtistName());
			manager.getTransaction().commit();
			manager.close();
			
		}
		
		public Song searchSongByName(String oldName) {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<Song> query = manager.createQuery("SELECT i FROM Song AS i WHERE i.songName = :songName", Song.class);
			query.setParameter("songName", oldName);
		try {
			Song dbEntity = query.getSingleResult();
			return dbEntity;
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
		}
	}

		
