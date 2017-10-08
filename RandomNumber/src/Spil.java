import java.util.Random;

public class Spil {
	 public static final int BROJ_KARATA=52;
	 private int tekKarta=0;
	 private Karta spilKarata[]=new Karta[BROJ_KARATA];
	 private static final Random randObj=new Random();
	 
	 public Spil(){
		 String rangovi[]={"2","3","4","5","6","7","8","9","10","Zandar","Dama","Kralj","Kec"};
		 String znakovi[]={" \2665 ", " \u2663 ", " \2663 ", " \u2666 "};
		 
		 int k=0;
		 for(int i=0;i<13;i++){
			for(int j=0;j<4;j++){
				spilKarata[k]=new Karta(rangovi[i],znakovi[j]);
				k++;
				}
		 	}
	 	}
	 
	 public void mesaj(){
		 tekKarta=0;
		 
		 for(int i=0;i<BROJ_KARATA;i++){
			 int randNum=randObj.nextInt(BROJ_KARATA);
			 Karta tempKarta= spilKarata[i];
			 spilKarata[i]=spilKarata[randNum];
			 spilKarata[randNum]=tempKarta;
		 	} 
	 	}

	 public Karta deli_k(){
		 if(tekKarta<BROJ_KARATA)
			 return spilKarata[tekKarta++];
		 else
			 return null;
	 	}
	 
	 public String deli_s(){
		 if(tekKarta<BROJ_KARATA)
			 return spilKarata[tekKarta++].imeKarte();
		 else
			 return null;
	 	}
	 
}
