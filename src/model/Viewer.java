package model;

public class Viewer implements Comparable<Viewer> {

	
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String country;
	private String photo;
	private String birthday;
	
	
	
	//Relations ABB
	
	private Viewer izq;
	private Viewer der;
	
	
	public Viewer(String id, String first_name, String last_name, String email, String gender, String country,
			String photo, String birthday) {
		
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.birthday = birthday;
		izq=null;
		der=null;
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



	public Viewer getIzq() {
		return izq;
	}



	public void setIzq(Viewer izq) {
		this.izq = izq;
	}



	public Viewer getDer() {
		return der;
	}



	public void setDer(Viewer der) {
		this.der = der;
	}
	
	
	public void addViewer(Viewer v )  {
	
		if (compareTo(v)>0) {
			
			if (izq == null) {
				izq = v;
			}
			else {
					izq.addViewer(v);
				}
		}else if (compareTo(v)<0) {
			if (der==null) {
				der=v;
			}else {
				der.addViewer(v);
			}
		}		
	}
	
	
	public Viewer searchViewer(String idd ) {
		
		if (id.compareToIgnoreCase(idd)==0) {
			
			return this ;
		}
		
		else  if (id.compareToIgnoreCase(idd)>0) {
			
			return (izq==null)?null : izq.searchViewer(idd);
		}else {
			
			return (der==null)?null : der.searchViewer(idd);
		}
		
		
	}


	 public int compareTo( Viewer o )
	    {
	       
	        return id.compareToIgnoreCase( o.getId() );
	    }



	@Override
	public String toString() {
		return "Viewer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", gender=" + gender + ", country=" + country + ", photo=" + photo + ", birthday=" + birthday + "]";
	}
	
	
	
	public String  searchCountryABB( String pais ) { 
		String msg ="";
        if( country.compareToIgnoreCase( pais ) == 0 ) {
        	msg +=  this.toString()+"\n";
           	msg += "|____";
           	if(izq != null && izq.country.equals(pais)) {
           		msg += izq.toString();
           	}
           	msg += "\n";
           	msg += "|____";
           	if(der != null && der.country.equals(pais)) {
           		msg += der.toString();
           	}
           	msg += "\n";
        }   
       	if(izq != null) {
       		msg += izq.searchCountryABB(pais);
       	}
       	if(der != null) {
       		msg += der.searchCountryABB(pais);
       	}
         return msg;
    
}
	
}
				
	
