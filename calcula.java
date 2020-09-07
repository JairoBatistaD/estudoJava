package imc;

public class calcula {

public	double media;
	
	public  Double IMC(double peso,double altura) {
		double aux = altura*altura;
		media = peso/aux;
		return media;
		
	}
}

