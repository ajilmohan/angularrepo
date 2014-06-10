package in.spa.angulr.repo;

import in.spa.angulr.domain.Bookmark;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookmarkRepo extends JpaRepository<Bookmark, Long> {
	
	/**
    * Finds a Bookmark by using the name and place  as  search criteria's.
    * @param userName
    * @param vennueId
    * @return  A list of Bookmarks whose last userName is an exact match with the given name and vennueId as given vennueId .
    *          If no Bookmark is found, this method returns an empty list.
    */
   @Query("SELECT p FROM Bookmark p WHERE p.userName = :userName and p.vennueId = :vennueId")
   public List<Bookmark> find(@Param("userName") String userName , @Param("vennueId") String vennueId);
   
   /**
    * Finds Bookmark by using the userName as a search criteria.
    * @param lastName
    * @return  A list of Bookmarks  whose userName  is an exact match with the given userName.
    *          If no Bookmark is found, this method returns null.
    */
   public List<Bookmark> findByUserName(String userName);

}
