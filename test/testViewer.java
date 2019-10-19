import static org.junit.jupiter.api.Assertions.*;


import model.*;
import org.junit.jupiter.api.Test;

class testViewer {

	
	private Viewer viewer;
	
	public void setupEscenario() {
		
		
		viewer = new Viewer("1234","andres","mayor","andresmayor03@gmail.com","Male","Colombia","hppt/:facebook.com","20/02/2001");
	}
	@Test
	public void testSearchViwer() {
		setupEscenario();
		Viewer c = new Viewer("12345","andres","mayor","andresmayor03@gmail.com","Male","Colombia","hppt/:facebook.com","20/02/2001");
		viewer.addViewer(c);
		
		assertTrue(viewer.searchViewer("12345").equals(c));
		
		
		
	}
	@Test
	public void testSearchCountryABB() {
		setupEscenario();
		Viewer c = new Viewer("12345","andres","mayor","andresmayor03@gmail.com","Male","Colombia","hppt/:facebook.com","20/02/2001");
		viewer.addViewer(c);
		assertTrue(viewer.searchCountryABB("Colombia")!=null);
		
		
		
	}
	
	
	
	

}
