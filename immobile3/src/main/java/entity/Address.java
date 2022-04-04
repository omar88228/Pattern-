package entity;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table( name= "T_ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 7139861127077786486L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private int id ;
	@Column(name="CAP")
	private int cap;
	@Column(name="STREET")
	private String street;
	@Column(name="CITY")
	private String city;
	@Column(name="PROVINCE")
	private String province;
	@Column(name="REGION")
	private String region;

	public Address() {

	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCap() {
		return cap;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return "Address : Street=" + street + ", city=" + city + ", province=" + province + ", region=" + region
				+ ", cap=" + cap + "";
	}

}
