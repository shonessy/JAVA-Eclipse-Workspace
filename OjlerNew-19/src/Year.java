
public class Year {
	static String days[]={"", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};
	static String months[]={"", "January", "February", "March", "April", "May", "Jun", 
											"July", "Avgust", "Septembar", "October", "November", "December"};
	
	int yearNum;
	boolean isLeap;
	int monthDays[][]=new int[13][];
	
	Year(int a){
		yearNum=a;
		isLeap=isLeap(a);
		monthDays[0]=new int[1];
		monthDays[1]=new int[31];
		monthDays[2]=new int[ isLeap ? 29:28];
		monthDays[3]=new int[31];
		monthDays[4]=new int[30];
		monthDays[5]=new int[31];
		monthDays[6]=new int[30];
		monthDays[7]=new int[31];
		monthDays[8]=new int[31];
		monthDays[9]=new int[30];
		monthDays[10]=new int[31];
		monthDays[11]=new int[30];
		monthDays[12]=new int[31];
		fillDays();
		
	}
	
	 
	//firstDayOfYear method
	int firstDayOfYear(int a){
		int brDana=0;
		for(int i=1900; i<=a; i++)
			brDana+=isLeap(i)? 366: 365;
		int ret=isLeap(a)? brDana%7 - 1 : brDana%7;
		return (ret==0) ? 7 : (ret==-1? 6 : ret);
	}
	
	
	// fillDays method
	void fillDays(){
		int k=firstDayOfYear(yearNum);

		for(int i=1;i<monthDays.length;i++)
			for(int j=0; j<monthDays[i].length; j++){
				monthDays[i][j]=k++;
				if(k>7)
					k=1;
			}
	}//end
	
	// isLeap method
	boolean isLeap(int a){
		if(a%4==0){
			if(a%100==0 ){
				if(a%400==0)
					return true;
				return false;
			}
			else
				return true;
		}
		else
			return false;
	}
	
	// printYear() method
	void printYear(){
		System.out.println("----------------------YEAR: " + yearNum + " ------------------");
		for(int i=1;i<monthDays.length;i++){
			System.out.print(months[i] + ":\t ");
			for(int j=0;j<monthDays[i].length;j++){	 
				System.out.print( (j+1) + ". " + days[monthDays[i][j]] + "\t ");
			}
			System.out.println();
		}
		System.out.println("----------------------YEAR: " + yearNum + " ------------------");
		System.out.println();
	}//end
	
	// getFirstDayOfMonth() method
	int getFirstDayOfMonth(int n){
		if(n>=1 && n<=12)
			return monthDays[n][0];
		else
			return -1;
	}
	
	
}
