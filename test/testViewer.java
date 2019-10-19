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
	
	@Test
	public void testAddViewer() {
		setupEscenario();
		Viewer v1 = new Viewer("0203", "richi", "pacho", "nn@nn.co", "female", "Colombia", "Photo", "20/02/2019");
		Viewer v2 = new Viewer("9920", "richi", "pacho", "nn@nn.co", "female", "Colombia", "Photo", "20/02/2019");
		viewer.addViewer(v1);
		viewer.addViewer(v2);
		assertTrue(viewer.getIzq().compareTo(v1) == 0);
		assertTrue(viewer.getDer().compareTo(v2) == 0);
	}
	
	
	
	

}
