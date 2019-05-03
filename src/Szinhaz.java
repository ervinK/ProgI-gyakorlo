import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Szinhaz {
	
	private List<Szinesz>szineszek;
	
	public List<Szinesz> getSzineszek() {
		return szineszek;
	}

	public void setSzineszek(List<Szinesz> szineszek) {
		this.szineszek = szineszek;
	}

	public Szinhaz() {
		szineszek = new ArrayList<Szinesz>();
	}
	
	
	
	public void beolvas(String fajlnev) {
		Scanner scanner = null;
        try {
        	//pelda: String[] szavak = mondat.split(" ");
            scanner = new Scanner(new File(fajlnev));
            while(scanner.hasNextLine()) {
                String [] paramz = scanner.nextLine().split(";");
                szineszek.add(new MusicalSzinesz(Integer.parseInt(paramz[0]), Boolean.parseBoolean(paramz[1]),
                		paramz[2]));
            }
        } catch (IOException e) {
            System.err.println("Hiba történt: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
	}
	
	public void rendez(){
        this.szineszek.sort((Comparator<? super Szinesz>) new Comparator<Szinesz>() {

			@Override
			public int compare(Szinesz arg0, Szinesz arg1) {
				return (arg0.getKor()-arg1.getKor());
			}
        	
        });
       
}

}
