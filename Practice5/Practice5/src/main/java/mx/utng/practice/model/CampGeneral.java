package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="campGenerals")
public class CampGeneral {
	@Id @GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private String locationId ;
	@Column
	private String optCampType ;
	@Column
	private String address ;
	@Column
	private String capacity ;
	@Column
	private String shelters ;
	@Column
	private String area ;
	@Column
	private String personsPerShelter ;
	
	public CampGeneral(String name, String locationId, String optCampType, String address, String capacity,
			String shelters,String area, String personsPerShelter ){
		super();
		this.name= name;
		this.locationId=locationId;
		this.optCampType=optCampType;
		this.address=address;
		this.capacity=capacity;
		this.shelters=shelters;
		this.area=area;
		this.personsPerShelter=personsPerShelter;
	}
 public CampGeneral() {
	this("","","","","","","","");
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocationId() {
	return locationId;
}
public void setLocationId(String locationId) {
	this.locationId = locationId;
}
public String getOptCampType() {
	return optCampType;
}
public void setOptCampType(String optCampType) {
	this.optCampType = optCampType;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public String getShelters() {
	return shelters;
}
public void setShelters(String shelters) {
	this.shelters = shelters;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getPersonsPerShelter() {
	return personsPerShelter;
}
public void setPersonsPerShelter(String personsPerShelter) {
	this.personsPerShelter = personsPerShelter;
}
@Override
public String toString() {
	return "CampGeneral [id=" + id + ", name=" + name + ", locationId=" + locationId + ", optCampType=" + optCampType
			+ ", address=" + address + ", capacity=" + capacity + ", shelters=" + shelters + ", area=" + area
			+ ", personsPerShelter=" + personsPerShelter + "]";
}
 
	
}
