import java.util.Scanner;

public class TestAnagrams {
	static int anagNum=0;
	char word[];
	
	//------------------------------------------//
	//constructor
	public TestAnagrams(int n){
		word=new char[n];
	}
	//------------------------------------------//
	//get word
	public String getWord(){
		return String.valueOf(word);
	}
	//------------------------------------------//
	//fill word
	public void fillWord(String s){
		for(int i=0; i<s.length(); i++)
			word[i]=s.charAt(i);
	}
	//------------------------------------------//
	//rotate left
	public void rotateLeft(int n){
		char temp=word[word.length-n];
		for(int i=word.length-n+1; i<word.length; i++)
			word[i-1]=word[i];
		word[word.length-1]=temp;
	}
	//------------------------------------------//
	//do anagram
	public void doAnagram(int n){
		if(n==1)
			return;
		for(int i=0; i<n; i++){
			doAnagram(n-1);
			if(n==2)
				System.out.println((++anagNum) + ". " + getWord());
			rotateLeft(n);
		}
	}
	//------------------------------------------//

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite rec: ");
		String s=input.nextLine();
		TestAnagrams ta=new TestAnagrams(s.length());
		ta.fillWord(s);
		System.out.println("Word: " + ta.getWord());
		
		ta.doAnagram(s.length());
	}
	//------------------------------------------//

}
