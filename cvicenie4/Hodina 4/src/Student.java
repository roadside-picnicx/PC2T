
public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer() throws CustomException{
		if(studijniPrumer==0)
			throw new CustomException();
		return studijniPrumer;
		
	}

	public void setStudijniPrumer(float studijniPrumer) throws CustomException {
		if (studijniPrumer<1 || studijniPrumer>5)
			throw new CustomException("Zadajte prosim priemer v rozmedzi 1-5");
		this.studijniPrumer = studijniPrumer;
		
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}