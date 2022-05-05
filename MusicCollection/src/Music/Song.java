package Music;

public class Song {
	
	private String title;  // title variable
	private String artist; // artist variable
	private String genre; // genre variable
	
	/**@return Will return a song with the title artist and genre
	 * */
	// Song constructor
	public Song(String title, String artist, String genre) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		return;
	}
	
	/**@return Will return a song with the title and artist 
	 * */
	//Song constructor 
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		return;
	}
	
	/**@return Will return a String with the title artist and genre
	 * */
	// method to return
	public   String toString(){
		
		return artist + " " + title + " " + genre;
	}
	
	/**@return Will return a song with the title
	 * */ 
	//getter for the title
	public String getTitle() {
		return title;
	}

	/**@return Will return a song with the  artist and 
	 * */
	//getter for the artist
	public String getArtist() {
		return artist;
	}
	
	/**@return Will return a song with the  genre
	 * */
	// getter for the genre
	public String getGenre() {
		return genre;
	}
	
	/**@param title is the song title
	 * */
	
	//setter for the title
	public void setTitle(String title) {
		this.title = title;
	}
	/**@param artist is the song artist
	 * */
	
	//setter for the artist
	public void setArtist(String artist) {
		this.artist = artist;
		}
	/**@param genre is the song genre
	 * */
		
	//setter for the genre
	public void setGenre(String genre) {
		this.genre = genre;
		}

}
