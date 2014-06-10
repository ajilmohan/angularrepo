package in.spa.angulr.service;

import java.util.List;

import in.spa.angulr.domain.Bookmark;

public interface BookmarkService extends CrudService<Bookmark>{
	
	List<Bookmark> findBookmarkForUserAndPlace(Bookmark bookmark);
	List<Bookmark> findByUserName(String username);

}
