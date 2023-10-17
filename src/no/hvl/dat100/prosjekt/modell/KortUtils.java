package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		// TODO - START
		KortSamling tempSamling = new KortSamling();
		for (int i = 0; i<samling.getAntalKort();i++) tempSamling.leggTil(samling.taSiste());	
		while(tempSamling.getAntalKort()>0){
			Kort beste = tempSamling.getAllekort()[0];
			for (int i = 0; i<tempSamling.getAntalKort();i++){
				if (tempSamling.getAllekort()[i].compareTo(beste)<0) beste = tempSamling.getAllekort()[i];
			}
			samling.leggTil(beste);
			tempSamling.fjern(beste);
		}	
		// TODO - END
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		Random random = new Random();
		KortSamling tempSamling = new KortSamling();
		int tall = samling.getAntalKort();
		for (int i = 0; i<tall;i++) tempSamling.leggTil(samling.taSiste());	
		while(tempSamling.getAntalKort()>0){
			Kort leggTil = tempSamling.getAllekort()[random.nextInt(tempSamling.getAntalKort())];
			samling.leggTil(leggTil);
			tempSamling.fjern(leggTil);
		}	
		
	}

}
