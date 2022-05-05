package Music;

public class Album {
	
	private  String title;
	private  String artist;
	private  String genre;
	private Song favoriteTrack;
	private int trackNumber;
	 static int numAlbums;
	 
	 //Album constructors 
	 public  Album(String title, Song favoriteTrack, int trackNumber) {
		 this.title =  title;
		 this.favoriteTrack =  favoriteTrack;
		 this.trackNumber =  trackNumber; 
		 this.artist = favoriteTrack.getArtist();
		 this.genre = favoriteTrack.getGenre();
		 numAlbums++;
		 return;
	 }
	 
	
	 
	 public Album(String title, Song favoriteTrack) {
		
          trackNumber =1;
          return;
		
	 }
	// method to return
		public  String toString(){
			return this.artist +" " + this.title  +" " + this.genre;
		}
		//getter for the title
		public String getTitle() {
			return title;
		}
		//getter for the artist
		public Song getFavoriteTrack() {
			return favoriteTrack;
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
		public void setFavoriteTrack(Song favoriteTrack) {
			this.favoriteTrack = favoriteTrack;
			}
			
		//setter for the genre
		public void setGenre(String genre) {
			this.genre = genre;
			favoriteTrack.setGenre(genre); //calling the favorite track to set the genre
			}

	

}
