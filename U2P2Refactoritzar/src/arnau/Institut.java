package arnau;

public class Institut {
	private static final int ANY = 2022;
	private static final String CICLE_FORMATIU = "1er DAM";
	private static final String COGNOMS_ALUMNE = "Carbonell";
	private static final String NOM_ALUMNE = "Arnau";

	public static void main(String[] args) {
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognom = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p);
	}
}
