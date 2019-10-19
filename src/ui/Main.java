package ui;


import java.io.IOException;
import java.util.Scanner;

import model.*;

public class Main {

	
	private Event user;
	private  Scanner reader;
	
	
	
	public Main () {
		
		reader = new Scanner(System.in);
		
	}
	
	
	public static void main (String[] args) {
		Main m = new Main();
		m.welcome();
		m.archive();
		
	}
	
	public void welcome () {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("|                             WELCOME TO THE PAN AMERICAN CUP                                |");
		System.out.println("----------------------------------------------------------------------------------------------");
	}
	
	public void showMenu() {
		int option = 0;
		while(option!=5) {
			
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println( "1.Search viewer." );
			System.out.println( "2.Search competitor.");
			System.out.println( "3.Search country in competitors.");
			System.out.println( "4.Search country in the spectators.");
			System.out.println( "5.Exit.");
			System.out.println("----------------------------------------------------------------------------------------------");
			option = reader.nextInt();
			reader.nextLine();
			
			switch(option){
			
			case(1):
				searchViewer();
				break;
			
			case(2):
				searchCompetitor();
				break;
				
			case(3):
				countryCompetitor();
				break;
				
			case(4):
				countryVierwer ();
				break;	
			}	
		}
	}
	
	
	public void searchViewer() {
		System.out.println("Please enter the viewer's ID: " );
		String n = reader.nextLine();
		long t1 = System.currentTimeMillis();
		System.out.println(user.searchViewer(n));
		long t2 = System.currentTimeMillis();
		System.out.println("System time when performing the method: "+(t2-t1));
	}
	
	public void searchCompetitor() {
		System.out.println("Please enter the competitor ID: " );
		String n = reader.nextLine();
		long t1 = System.currentTimeMillis();
		System.out.println(user.searchCompetitor(n));
		long t2 = System.currentTimeMillis();
		System.out.println("System time when performing the method: "+(t2-t1));
	
	}
	
	public void archive() {
		boolean enco =false;
		 
		while(!enco) {
			
		System.out.println("Please enter the file name: ");
		String archive = reader.nextLine();
		
	if (archive.contentEquals("datas.csv")) {
			try {
				user = new Event(archive);
				showMenu();
				
			} catch (IOException e) {		
		}
			enco =true;
			
	}else {
		System.out.println("You entered the file name incorrectly (datas.csv).");
		System.out.println("----------------------------------------------------------------------------------------------");

		
	}
		}
	}
	
	public void  countryCompetitor () {
		System.out.println("Enter the name of the competitors' COUNTRY: ");
		String pais  = reader.nextLine();
		long t1 = System.currentTimeMillis();
		System.out.println(user.searchCountryCompetitor(pais));	
		long t2 = System.currentTimeMillis();
		System.out.println("System time when performing the method: "+(t2-t1));
	}
	
	public void  countryVierwer () {
		System.out.println("Enter the country name of the viewers: ");
		String pais  = reader.nextLine();
		long t1 = System.currentTimeMillis();
		System.out.println(user.searchCountryABB(pais));
		long t2 = System.currentTimeMillis();
		System.out.println("System time when performing the method: "+(t2-t1));
	}
	
	
	
	
}
