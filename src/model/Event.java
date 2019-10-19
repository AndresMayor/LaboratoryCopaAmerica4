package model;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class Event  {
	
	
	
	private String data;

	
	//Relations
	
	private Competitor firsCompetitor;
	private Viewer raizVierwer;
	
	
	
	public Event(String data) throws IOException   {
		
		this.data = data;
		
			loadData();
		
		
	}
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public Competitor getFirsCompetitor() {
		return firsCompetitor;
	}

	public void setFirsCompetitor(Competitor firsCompetitor) {
		this.firsCompetitor = firsCompetitor;
	}

	public Viewer getRaizVierwer() {
		return raizVierwer;
	}

	public void setRaizVierwer(Viewer raizVierwer) {
		this.raizVierwer = raizVierwer;
	}
	
	public Viewer searchViewer(String id) {
		
		if (raizVierwer == null) {
			return null;
		}else {
			return raizVierwer.searchViewer(id);
			
		}	
	}
	
	//Metodo para buscar un competidor
	
	
	
	public Competitor searchCompetitor(String id) {
		Competitor actual =firsCompetitor;
		Competitor c = null;
		boolean finded = false;
	
			
		while (actual!=null && !finded ) {
			if (actual.getId().compareTo(id)==0) {
				c=actual;
				finded=true;
				
				
			}
			actual=actual.getNext();
		}
		return  c;	
	}

	public void loadData() throws IOException {
			
	File file = new File(data);
	BufferedReader bufferedr = new BufferedReader (new FileReader(file));
	String read ="";
	while((read = bufferedr.readLine()) != null) {	
		if (!read.equals("id,first_name,last_name,email,gender,country,photo,birthday")) {
		String [] arreglo =read.split(",");
	    Viewer newViewer = new Viewer(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4],arreglo[5],arreglo[6],arreglo[7]);
		if (raizVierwer == null) {
			raizVierwer=newViewer;
		}else {
			raizVierwer.addViewer(newViewer);
		}
		if((int)(Math.random()*2)==0) {
		Competitor newCompetitor = new Competitor(arreglo[0],arreglo[1],arreglo[2],arreglo[3],arreglo[4],arreglo[5],arreglo[6],arreglo[7]);
		if (firsCompetitor == null) {
			firsCompetitor =newCompetitor ;		
		}else {
			newCompetitor.setNext(firsCompetitor);
			firsCompetitor.setPrevious(newCompetitor );
			firsCompetitor = newCompetitor ;
						}
					}
				}
			}
	bufferedr.close();
	}
			
	public String searchCountryCompetitor(String pais) {
		
	Competitor actual = firsCompetitor;
	 String msg=null;	 
	 if (firsCompetitor == null) {
		  return null;	 
	}
	 while (actual !=null ) {
		 if (actual.getCountry().equals(pais)) {
			 msg += actual.toString()  +"\n";	
		 }
		 actual = actual.getNext();	 
		 }
		 return msg ;
}
	
	public String  searchCountryABB (String pais) {
			
	return  raizVierwer == null ? null : raizVierwer.searchCountryABB( pais );
		
	}
	
	
	
}
