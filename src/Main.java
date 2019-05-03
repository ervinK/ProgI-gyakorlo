import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		NagyonjoMusicalSzinesz njms = new NagyonjoMusicalSzinesz();
		try {
			njms.szineszkedik();
		}catch(Exception e) { //tobb is lehet egymas utan, mint az elif
			System.out.println(e.getMessage());
		}finally {
			System.out.println("A szindarab vegetert!");
		}
		
		List<Szinesz> szineszlista = new ArrayList<Szinesz>();
		szineszlista.add(new MusicalSzinesz()); //!!!!!!!!!!!!
		szineszlista.add(new NagyonjoMusicalSzinesz(43,false,"Hernadi Jucus"));
		szineszlista.add(new MusicalSzinesz(44,true,"Oroszlan Szonja"));
		
		//szineszlista.remove(0);
		
		for(Szinesz sz: szineszlista) {
			System.out.println(sz.getNev()); //tstrng
		}
		
		/*Iterator<Szinesz> it = szineszlista.iterator();
        while(it.hasNext()) {
            Szinesz sz = it.next(); //nameeeer?
            System.out.print(sz + " ");
        }*/
		
		/*Map<Szinesz, Integer> ratings = new HashMap<>();
		ratings.put(new MusicalSzinesz(), 3);
		ratings.put(new MusicalSzinesz(44,true,"Oroszlan Szonja"), 4);
		ratings.put(new NagyonjoMusicalSzinesz(43,false,"Hernadi Jucus"), 5);
		
		ratings.forEach((szinesz, ertekeles) -> {
			
			System.out.println(szinesz + "\nErtekeles:" + ertekeles);
			
		});*/
		
		Szinhaz szigligeti = new Szinhaz();
		szigligeti.beolvas("szineszek.csv");
		System.out.println(szigligeti.getSzineszek());
		szigligeti.rendez();
		System.out.println(szigligeti.getSzineszek());
		
		
		
		
	}

}
