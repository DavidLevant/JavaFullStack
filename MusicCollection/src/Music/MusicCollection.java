/**
 * @author David Levant
 * This program will generate a collection of music 
 * */



package Music;
import Music.Album;
import Music.Song;
import java.util.Scanner;

public class MusicCollection {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  //The Scanner
		Integer tm =1; // variable name tm for the user input
		
		
	    Song song = new Song("X goona bring it to ya", "DMX");
		
		Song song2 = new Song ("Jump Jump", "Kirss Kross", "Hip-Hop");
		
		Song song3 = new Song("I wanna Rock", "Dude and Band", "Rock");
		
		
		
		Album album3 = new Album("South Park", song3, 7);
		
		Album album4 = new Album("OutKast Album", song2, 9);
		
		Album album5 = new Album("Milley Rock Album", song2, 10);
		
		Album album6 = new Album("The Black Tape Album", song, 13);	
         
		
	
		
		
		
		
		while (tm !=0) {
			
		System.out.println("Music Collection");
		System.out.println("[1]" + " " + album3.getTitle()); 
		System.out.println("[2]" + " " + album4.getTitle());
		System.out.println("[3]" + " " + album5.getTitle());
		System.out.println("[4]" + " " + album6.getTitle());
		tm = input.nextInt();
		input.nextLine();
		
		/**
		 *  @param album3 This is the first album in the collection
		 *  @param album4 This is the second album in the collection
		 *  @param album5 This is the third album in the collection
		 *  @param album6 This is the fourth album in the collection
		 * 
		 * */
		
		if (tm  == 1){
			albumOptions(album3);
		}
		
		if (tm == 2) {
			albumOptions(album4);
		}
		if (tm == 3) {
			albumOptions(album5);
		}
		if (tm == 4) {
			albumOptions(album6);
			
			input.close();
		}
		
		
}
	//add if statement 
		
		/**
		 * @param album is using the album object from the Album class
		 * */
	
}
	public static void  albumOptions(Album album) {
		    int vm =4;
		    
	     	Scanner input1 = new Scanner(System.in);
			System.out.println(album.toString());
			System.out.println(album.getGenre());
			
			
			
			   
				
				System.out.println("Choose one of following options");
				System.out.println("Get Favorite Track press 1");
				System.out.println("Change Genre press 2");
				System.out.println("Press 0 to exit");
				
				
				vm = input1.nextInt();
				input1.nextLine();
				
				/**
				 * @param genre is the genre variable from the Album class
				 * */
				if (vm  == 1){
					System.out.println("I work" + album.getFavoriteTrack());
				}
				
				if (vm == 2) {
					
					String genre;
					
					Scanner vn = new Scanner(System.in); // new scanner
					genre = vn.nextLine(); //asks the user to set the genre variable
					album.setGenre(genre); //sets the genre to the info the user entered
					System.out.println(album.getGenre()); //printing out the getGenre method in the album class
					
					//scanner input
					//album.setGenre(genre);
					
				}
				
				
			return;
			

		
	}
}

