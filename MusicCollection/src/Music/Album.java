package Music;

public class Album {
	
	private  String title;
	private  String artist;
	private  String genre;
	private Song favoriteTrack;
	private int trackNumber;
	 static int numAlbums;
	 
	//Album constructors 
		/** @return This will return the album
		 * */ 
	 public  Album(String title, Song favoriteTrack, int trackNumber) {
		 this.title =  title;
		 this.favoriteTrack =  favoriteTrack;
		 this.trackNumber =  trackNumber; 
		 this.artist = favoriteTrack.getArtist();
		 this.genre = favoriteTrack.getGenre();
		 numAlbums++;
		 return;
	 }
	 
	
	//Album constructors 
	/** @return This will return the album
	 * */
	 
	 public Album(String title, Song favoriteTrack) {
		
          trackNumber =1;
          return;
		
	 }
	// method to return
	 
	 /**
	  * @return this will return the artist title and genre variable
	  * */
		public  String toString(){
			return this.artist +" " + this.title  +" " + this.genre;
		}
		/**
		  * @return this will return the title variable
		  * */
		
		//getter for the title
		
		
		public String getTitle() {
			return title;
		}
		
		/**
		  * @return this will return the FavoriteTrack
		  * */
		//getter for the artist
		public Song getFavoriteTrack() {
			return favoriteTrack;
		}
		
		/**
		  * @return this will return the Genre
		  * */
		// getter for the genre
		public String getGenre() {
			return genre;
		}
		
		
		/**
		 * @param title is the variable for the song title
		 * */
		//setter for the title
		public void setTitle(String title) {
			this.title = title;
		}
		/**
		 * @param favoriteTrack is the variable for the song favorite track
		 * */
		//setter for the artist
		public void setFavoriteTrack(Song favoriteTrack) {
			this.favoriteTrack = favoriteTrack;
			}
			
		/**
		 * @param genre is the variable for the song genre
		 * */
		//setter for the genre
		public void setGenre(String genre) {
			this.genre = genre;
			favoriteTrack.setGenre(genre); //calling the favorite track to set the genre
			}

	

}
