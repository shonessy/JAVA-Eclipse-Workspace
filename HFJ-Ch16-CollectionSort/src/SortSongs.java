import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortSongs {
	
	private ArrayList<String> songList=null;
	BufferedReader br = null;
	private File songFile = new File("G:/Eclipse JAVA WorkSpace/HFJ-Ch16-CollectionSort/src/Songs.txt");
	
	//------------------------------------------------------------------//
	//constructor
	public SortSongs(){
		try{
			songList = new ArrayList<>();
			br = new BufferedReader(new FileReader(songFile));
		}catch(FileNotFoundException e){
			System.out.println("Error: Can't find file");
		}	
	}
	//------------------------------------------------------------------//
	
	//add song title to songList
	private void addToList(String songTitle){
		songList.add(songTitle);
	}
	//------------------------------------------------------------------//
	
	//add song Title
	private void addSongTitlesToList(){
		try{
			String song=null;
			while( (song=br.readLine()) != null ){
				String delimiteres[]=song.split("/");
				addToList(delimiteres[0]);
			}
		}catch(IOException e){
			System.out.println("Error: Can't read from file");
		}
	}
	//------------------------------------------------------------------//
	
	//print list
	private void printSongList(){
		System.out.println(songList);
	}
	//------------------------------------------------------------------//
	
	//sort list
	private void sortList(){
		Collections.sort(songList);
	}
	//------------------------------------------------------------------//

	//main
	public static void main(String[] args) {
		System.out.println("zdravo");
		SortSongs sr = new SortSongs();
		sr.addSongTitlesToList();
		System.out.println("Ne sortirana lista pjesama: ");
		sr.printSongList();
		System.out.println("\nSortirana lista pjesama: ");
		sr.sortList();
		sr.printSongList();
	}
	//------------------------------------------------------------------//


}
