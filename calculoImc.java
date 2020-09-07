package imc;
import java.util.Scanner;


public class calculoImc {

	public static void main(String[] args) {
		calcula calcula =  new calcula();
		double peso;
		double altura;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe seu peso");
		peso = ler.nextDouble();
		System.out.println("informe sua altura");
		altura = ler.nextDouble();
	
		System.out.println("seu IMC é "+calcula.IMC(peso, altura));

			if(calcula.IMC(peso, altura)<18.5) {
				System.out.println("Voce está abaixo do peso");
			}else {
				if(calcula.IMC(peso, altura)>18.5 && calcula.IMC(peso, altura)<24.9 ) {
						System.out.println("Peso Normal");
					}else if(calcula.IMC(peso, altura)>24.9 && calcula.IMC(peso, altura) < 29.9) {
							System.out.println("Sobre peso, Procure um medico");
						}else if(calcula.IMC(peso, altura)>30 &&calcula.IMC(peso, altura) <34.9) {
								System.out.println("Obesidade Grau 1");
							}else if(calcula.IMC(peso, altura)>35 && calcula.IMC(peso, altura)<39.9) {
									System.out.println("Obesidade Grau 2");
								}else if(calcula.IMC(peso, altura)>39.9) {
									System.out.println("Obesidade grau 3 ");
				}
			}
	}

}
