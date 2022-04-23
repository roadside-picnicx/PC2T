class Ctverec {

	private float hrana;
	// vypocet obsahu ctverce
	float vypoctiObsah(){					
		return (float)(hrana*hrana);		//14. chyba float
	}
	// zjisteni delky hrany ctverce
	float getHrana(){					
		return hrana;
	}
	// nastaveni delky hrany ctverce
	void setHrana(float delka){			
		hrana=delka;
	}
	// konstruktor se zadanim delky hrany ctverce
	Ctverec(float hrana){				
		this.hrana=hrana;	//1. chyba		
	}
}
