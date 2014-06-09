package in.spa.angulr.service.impl;

import java.sql.SQLException;
import java.util.List;

import in.spa.angulr.domain.Bookmark;
import in.spa.angulr.repo.BookmarkRepo;
import in.spa.angulr.service.BookmarkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("BookmarkServiceImpl")
@Transactional
public class BookmarkServiceImpl implements BookmarkService {
	
	@Autowired
	private BookmarkRepo bookmarkRepo;

	public Bookmark save(Bookmark entity) throws SQLException {
		return bookmarkRepo.saveAndFlush(entity);
	}

	public void delete(long id) throws SQLException {
		bookmarkRepo.delete(id);
	}

	public void deleteAll() throws SQLException {
		bookmarkRepo.deleteAll();
	}

	public Bookmark findOne(long id) throws SQLException {
		return bookmarkRepo.findOne(id);
	}

	public List<Bookmark> findAll() throws SQLException {
		return bookmarkRepo.findAll();
	}

}
