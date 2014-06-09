package in.spa.angulr.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookmark_dts")
public class Bookmark implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "VENNUEID")
	private String vennueId;

	@Column(name = "VENNUENAME")
	private String vennueName;
	

	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "CATEGORY")
	private String categorys;
	
	@Column(name = "RATING")
	private double rating;
	
	@Column(name = "TS")
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
