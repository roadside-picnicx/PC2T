import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					try {
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(sc.nextInt());
					break;
					}
					catch (java.util.InputMismatchException e)
					{ 
						System.out.println("Nezadali ste cislo"+e.toString());
						break;
					}
		
				case 2:
					try {
					mojeDatabaze.setStudent();
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Databaza studentov je plna");
					}
				
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx=sc.nextInt();
					prumer =sc.nextFloat();
					try {
					mojeDatabaze.setPrumer(idx,prumer);
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Zvolili ste zly index");
					}
					catch (NullPointerException e) {
						System.out.println("Zadaná položka neexistuje");
					}
					
					catch (CustomException e) {
						System.out.println("Priemer nie je medzi 1-5");
					}
				
					
					break;
				case 4:
					try {
					System.out.println("Zadejte index studenta");
					idx=sc.nextInt();
					Student info=mojeDatabaze.getStudent(idx);
					
					
					System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Zvolili ste neplatny index");
					}
					catch (NullPointerException e) {
						System.out.println("Zadaná položka neexistuje");
					}
				
					catch (Exception e) {
						
					}
					
					break; 
					case 5:
					run=false;
					break;
			}
			
		}
	}

}
