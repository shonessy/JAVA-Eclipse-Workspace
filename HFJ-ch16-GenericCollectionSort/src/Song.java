
public class Song implements Comparable<Song>{
	
	private static int totalSongs=0;
	
	private String title,
				   artist;
	
	private int    rating,
				   bpm,
				   songNum;
	
	//-----------------------------------------//
	//constructor
	public Song(String title, String artist, int rating, int bpm){
		this.title=title;
		this.artist=artist;
		this.rating=rating;
		this.bpm=bpm;
		songNum=++totalSongs;
	}
	//-----------------------------------------//
	//getTitle
	public String getTitle(){
		return this.title;
	}
	//-----------------------------------------//
	//toString
	@Override
	public String toString(){
		return "Song_" + songNum + ": " + 
			   "\n\tTitle: " + title +
			   "\n\tArtist: " + artist + 
			   "\n\tRating: " + rating +
			   "\n\tBPM: " + bpm + "\n";
	}
	//-----------------------------------------//
	//implements compareTo
	@Override
	public int compareTo(Song song){
		return this.title.compareTo(song.getTitle());
	}

}
