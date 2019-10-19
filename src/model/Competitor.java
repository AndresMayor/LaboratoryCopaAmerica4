package model;

public class Competitor {

	
	
	//Atributos
	
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String country;
	private String photo;
	private String birthday;
	
	
	//Relations listDoble
	
	
	private Competitor previous;
	private Competitor next;
	
	
	//Constructor
	
	
	public Competitor(String id, String first_name, String last_name, String email, String gender, String country,
			String photo, String birthday) {
		
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.birthday = birthday;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public Competitor getPrevious() {
		return previous;
	}


	public void setPrevious(Competitor previous) {
		this.previous = previous;
	}


	public Competitor getNext() {
		return next;
	}


	public void setNext(Competitor next) {
		this.next = next;
	}


	public int compareTo(String  id2) {
		
		return id.compareTo(id2);
	}


	@Override
	public String toString() {
		return "Competitor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", gender=" + gender + ", country=" + country + ", photo=" + photo + ", birthday=" + birthday + "]";
	}
	
	
}
