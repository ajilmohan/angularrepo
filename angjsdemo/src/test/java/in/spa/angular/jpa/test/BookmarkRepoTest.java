package in.spa.angular.jpa.test;

import in.spa.angulr.domain.Bookmark;
import in.spa.angulr.repo.BookmarkRepo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
//@Ignore
public class BookmarkRepoTest {
	
	@Autowired
	private BookmarkRepo bookmarkRepo;
	
//	@Test
	@Transactional
	@Rollback(false)
	public void testInsert(){
		Bookmark bk  = new Bookmark();
		System.out.println("test run");
		
		bk.setUserName("ajil");
		bk.setAddress("koramangala");
		bk.setCategorys("fashion");
		bk.setRating(8);
		Date date = new Date();
		bk.setTs(new Timestamp(date.getTime()));
		bk.setVennueId("VN001");
		bk.setVennueName("Bangalore");
		
		try {
			bookmarkRepo.save(bk);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getBookmarksForuser(){
		Bookmark bk  = new Bookmark();
		bk.setUserName("Praveen");
		bk.setVennueId("3fd66200f964a520c7f11ee3");
		try {
		 List<Bookmark>	 bookmarks  =  bookmarkRepo.find(bk.getUserName(), bk.getVennueId());
		 System.out.println(bookmarks.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
