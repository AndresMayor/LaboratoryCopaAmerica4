import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import model.*;

class testEvent {

	
	
	
	//relation
	
	private Event event;
	
	
	public void setupEscenario() {
		try {
			event = new Event("datas.csv");
		} catch (IOException e) {
			
		}
	}
	
	@Test
	public void testSeacrhCompetitor(){
		setupEscenario();
		//String id, String first_name, String last_name, String email, String gender, String country,String photo, String birthday
		Viewer c  = new Viewer("1234","andres","mayor","andresmayor03@gmail.com","Male","Colombia","hppt/:facebook.com","20/02/2001");
		
		event.getRaizVierwer().addViewer(c);
		assertTrue(event.searchViewer("1234").equals(c));
		
		
	}
	@Test
	public void testloadData() {
		setupEscenario();
		
		assertTrue(event.getFirsCompetitor()!=null);
		assertTrue(event.getRaizVierwer()!=null);
		
		
	}
	@Test
	public void testsearchCountryCompetitor() {
		setupEscenario();
		Viewer c  = new Viewer("1234","andres","mayor","andresmayor03@gmail.com","Male","Colombia","hppt/:facebook.com","20/02/2001");
		event.getRaizVierwer().addViewer(c);
		assertTrue(event.searchCountryABB("Colombia")!=null);
		
		
		
	}


}
