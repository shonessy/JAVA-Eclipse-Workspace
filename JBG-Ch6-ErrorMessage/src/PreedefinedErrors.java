
public class PreedefinedErrors {
	static String msg[]={"Output Error", 
						  "Input Error",
						  "Disk Full",
						  "Index Out-Of-Bounds" };
	static int howbad[]={3,3,2,4};
	
	static Error getPreedefinedErrorInfo(int i){
		if(i>=0 & i<4)
			return new Error(msg[i], howbad[i]);
		return new Error("No preedefined Error with code: " + i, 0);
		}
}
