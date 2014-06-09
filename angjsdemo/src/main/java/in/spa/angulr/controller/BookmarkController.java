package in.spa.angulr.controller;

import in.spa.angulr.domain.Bookmark;
import in.spa.angulr.dto.BookmarkDTO;
import in.spa.angulr.service.BookmarkService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/places")
public class BookmarkController {
	
	@Autowired
	private BookmarkService bookmarkService;
	
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public ResponseEntity<List<BookmarkDTO>> getBookmarks(@PathVariable("username") String name){
		List<BookmarkDTO> bookmarkDTOs = null;
		try {
				bookmarkDTOs = this.mapBookmarkToBookmarkDTO(bookmarkService.findAll());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<BookmarkDTO>>(bookmarkDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public ResponseEntity<String> createBookmarks(@RequestBody BookmarkDTO bookmark){
		String status = "";
		try {
			Bookmark bookmarkPersisted = null;
			bookmarkPersisted = bookmarkService.save(this.mapBookmarkDtoToBookmark(bookmark));
			if(bookmarkPersisted != null){
				status = "Book mark created";
			}
		} catch (SQLException e) {
			status = "Error on bookmark creation.";
			return new ResponseEntity<String>(status, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	private List<BookmarkDTO> mapBookmarkToBookmarkDTO(List <Bookmark> bookmarks){
		   //Initialize the Mapper
        Mapper mapper = new DozerBeanMapper();
        BookmarkDTO dto = null;
        List<BookmarkDTO> bookmarkDtos  = new ArrayList<BookmarkDTO>();
        for(Bookmark mark  : bookmarks ){
        	dto = mapper.map(mark, BookmarkDTO.class);
        	bookmarkDtos.add(dto);
        }
        return bookmarkDtos;
	}
	
	private Bookmark mapBookmarkDtoToBookmark(BookmarkDTO dto){
		  //Initialize the Mapper
        Mapper mapper = new DozerBeanMapper();
		Bookmark bookmark  = null;
		bookmark = mapper.map(bookmark, Bookmark.class);
		return bookmark;
	}
	

}
