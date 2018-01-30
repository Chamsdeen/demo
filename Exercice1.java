package ca.qc.cgodin;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final double TAUX_TPS = 0.05;
		 final double TAUX_TVQ = 0.075;
		 int quantite;
		 double prixUnitaire;
		 double coutAvantTax;
		 double coutTotal;
		 double totalTVQ;
		 double totalTPS;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Veuillez entrer le prix unitaire : ");
		 prixUnitaire = sc.nextDouble();
		 System.out.println("Veuillez la quantite : ");
		 sc.nextLine();
		 quantite = sc.nextDouble();
		
		 coutAvantTax = prixUnitaire * quantite;
		 totalTVQ = coutAvantTax * TAUX_TVQ;
		 totalTPS = coutAvantTax * TAUX_TPS;
		 coutTotal = coutAvantTax + totalTVQ + totalTPS;
			  
		 System.out.println("Le prix Unitaire:  " + prixUnitaire +
					             "\nLa quantite:  " + quantite +
			  		             "\nLe cout avant tax:  " + coutAvantTax +	  		            
			                     "\nTotal TVQ:   " + totalTVQ + 
			                     "\nTotal TPS:   " + totalTPS + 
			                     "\nLe couttotal:  " + coutTotal);  
			  System.exit(0);
	}

}
