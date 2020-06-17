package maps.entites;

import java.text.DecimalFormat;

/**
 * @author RichardBONNAMY
 *
 */
public class Pays implements Comparable<Pays> {

	/** nom */
	private String nom;
	
	/** continent */
	private String continent;

	/** population */
	private int population;
	/** pibHab */
	private int pibHab;
	
	/** Constructeur
	 * @param nom
	 * @param population
	 * @param pibHab
	 */
	public Pays(String nom, String continent, int population, int pibHab) {
		super();
		this.nom = nom;
		this.continent = continent;
		this.population = population;
		this.pibHab = pibHab;
	}
	
	@Override
	public int compareTo(Pays autre) {
		
		return this.pibHab - autre.getPibHab();
	}
	
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("0,000");
		return nom+" - Pop: "+population+" - Pib/hab:"+pibHab+" - Pib total:"+formatter.format(getPibTotal());
	}
	
	public double getPibTotal() {
		double calcul = (double)population * (double)pibHab;
		return calcul;
	}
	
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/** Getter
	 * @return the pibHab
	 */
	public int getPibHab() {
		return pibHab;
	}

	/** Setter
	 * @param pibHab the pibHab to set
	 */
	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}

	
	/** Getter
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
}
