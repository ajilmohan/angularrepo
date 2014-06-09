package in.spa.angulr.dto;

import java.sql.Timestamp;

public class BookmarkDTO {
	
	private Long id;

	private String userName;

	private String vennueId;

	private String vennueName;
	
	private String address;
	
	private String categorys;
	
	private double rating;
	
	private Timestamp ts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVennueId() {
		return vennueId;
	}

	public void setVennueId(String vennueId) {
		this.vennueId = vennueId;
	}

	public String getVennueName() {
		return vennueName;
	}

	public void setVennueName(String vennueName) {
		this.vennueName = vennueName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategorys() {
		return categorys;
	}

	public void setCategorys(String categorys) {
		this.categorys = categorys;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	
	

}
