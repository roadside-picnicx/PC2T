import java.util.Scanner;

public class Pole {

	// Konstruktor s velikosti pole
	Pole(int velikost)
	{
		mojeHranoly=new Hranol[velikost];
		sc=new Scanner(System.in);
	}
	
	// vlozeni hranolu do pole na prvni volnou pozici
	void zadejHranol(){
		boolean drevena=true;
		float delka=0;
		float vyska=0;
		System.out.println("Zadejte delku podstavy hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		delka=sc.nextFloat();
		System.out.println("Zadejte vysku hranolu");
		while(!sc.hasNextFloat())
		{
			sc.next();
		}
		vyska=sc.nextFloat();
		System.out.println("Je drevena?");
		while(!sc.hasNextBoolean()) //5.chyba hasNextFloat --> hasNextBoolean
		{
			sc.next();
		}
		drevena=sc.nextBoolean();
		if (Hranol.getPocetHranolu()==mojeHranoly.length) //6.chyba nemoze byt vacsie nez mojehranoly.lenght
		{
			System.out.println("Pole uz je zaplneno");
			return;
		}
		mojeHranoly[Hranol.getPocetHranolu()] = new Hranol (delka, vyska, drevena); //7. nevytvaral sa Hranol
		
	}
	
	// vypis objemu vsech hranolu
	void vypoctiObjem() 
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			System.out.println("Objem "+i+" hranolu je" + mojeHranoly[i].vypoctiObjem()); 	//8. vypocti Obsah namiesto objem
	}
	
	// vypis obsahu podstavy vsech hranolu
	void vypoctiObsahPodstavy()
	{
		for (int i=0;i<Hranol.getPocetHranolu();i++)
			System.out.println("Obsah podstavy " +i+" hranolu je" + mojeHranoly[i].vypoctiObsah()); 
	}
	
	// nalezeni indexu nejmensiho hranolu
	int najdiNejmensiObjem()
	{
		float min=Float.MAX_VALUE;			 //9. nikdy by sa to nestalo pretoze min je 0						
		int idx=0;										
		for (int i=0; i<Hranol.getPocetHranolu();i++)
		{
			if (mojeHranoly[i].vypoctiObjem()<min){
				min=mojeHranoly[i].vypoctiObjem();
				idx=i;
			}
		}
		return idx;
	}
	
	// zjisteni celkoveho poctu drevenych kostek
	int zjistiPocetDrevenych(){
		int pocetDrevenych=0;
		for (int i=0;i<mojeHranoly.length; i++)		//10. chyba < namiesto> (chybny loop)
		{
			if (mojeHranoly[i].zeDreva == true)				
				pocetDrevenych++;
		}
		return pocetDrevenych;
	}

	public Hranol[] getMojeHranoly() {  //11. getter
		return mojeHranoly;
	}
	
	private Scanner sc;
	private Hranol []mojeHranoly;
}
