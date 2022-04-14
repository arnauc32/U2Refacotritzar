package arnau;

public class Alumne {
		public String nom;
		public String cognom;
		public String cicleFormatiu;
		public int any;
		
		
		@Override
		public String toString() {
			return "nom = " + nom + System.lineSeparator()+
					"cognom = " + cognom +System.lineSeparator()+
					"any = " + any +System.lineSeparator()+
					"cicleFormatiu = "+ cicleFormatiu + System.lineSeparator();
		}
		
		
}
