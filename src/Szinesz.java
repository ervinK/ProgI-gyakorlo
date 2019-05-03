import java.util.Random;

public abstract class Szinesz {
	


	private int kor;
	private boolean lear;
	private String nev;
	
	public Szinesz(int k, boolean l, String n) {
		this.kor = k;
		this.lear = l;
		this.nev = n;
	}
	
	public Szinesz() {
		this.kor = 30;
		this.lear = true;
		this.nev = "Balint Emese";
	}
	
	public abstract void enekel();
	
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public boolean isLear() {
		return lear;
	}

	public void setLear(boolean lear) {
		this.lear = lear;
	}
	
	public void szineszkedik() throws ElfelejtettemASzovegem{
		Random r = new Random();
		int gen = r.nextInt(100);
		if(gen > 50) {
			throw new ElfelejtettemASzovegem("fgsdjgasfsdfasorjwe");
		}else {
			System.out.println("Csörformansz");
		}
	}
	
	public String toString() {
		return this.nev + "\n" + this.kor + "\n" + this.lear;
		
	}

}
