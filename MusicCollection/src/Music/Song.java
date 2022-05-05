package Music;

public class Song {
	
	private String title;  // title variable
	private String artist; // artist variable
	private String genre; // genre variable
	
	
	// Song constructor
	public Song(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		return;
	}
	
	//Song constructor 
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		return;
	}
	
	
	// method to return
	public   String toString(){
		
		return artist + " " + title + " " + genre;
	}
	//getter for the title
	public String getTitle() {
		return title;
	}
	//getter for the artist
	public String getArtist() {
		return artist;
	}
	// getter for the genre
	public String getGenre() {
		return genre;
	}
	
	//setter for the title
	public void setTitle(String title) {
		this.title = title;
	}
	
	//setter for the artist
	public void setArtist(String artist) {
		this.artist = artist;
		}
		
	//setter for the genre
	public void setGenre(String genre) {
		this.genre = genre;
		}

}
