/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 8, 2024 
*/ 
package controllerAlbum;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Album;
import model.Song;

public class AlbumHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Album");
	public void persist(Album model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
		
		public void delete(Album model) {
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.remove(manager.find(Album.class, model.getAlbumId()));
			manager.getTransaction().commit();
			manager.close();
	}
		
		@SuppressWarnings("unchecked")
		public List<Album> showAllalbum() {
			EntityManager manager = factory.createEntityManager();
			manager.clear();
			Query r = manager.createQuery("SELECT i FROM Album i");
			List<Album> allItems = r.getResultList();
			manager.close();
			return allItems;
		}
		
		public void update(Album model) {
			EntityManager manager = factory.createEntityManager();
			Album dbEntity = manager.find(Album.class, model.getAlbumId());
			manager.getTransaction().begin();
			dbEntity.setAlbumName(model.getAlbumName());
			dbEntity.setYearReleased(model.getYearReleased());
			manager.getTransaction().commit();
			manager.close();
		}
		
		public Album searchAlbumByName(String albumName) {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<Album> query = manager.createQuery("SELECT i FROM Album AS i WHERE i.albumName = :albumName", Album.class);
			query.setParameter("albumName", albumName);
			try {
				Album dbEntity = query.getSingleResult();
				return dbEntity;
			} catch (NoResultException e) {
				e.printStackTrace();
				return null;
			} finally {
				manager.close();
			}

}
}