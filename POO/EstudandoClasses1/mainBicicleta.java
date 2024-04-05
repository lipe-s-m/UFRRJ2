package POO.EstudandoClasses1;
import java.util.Scanner;


public class mainBicicleta 
{
	public static void main(String[] args)
	{
		
		int marcha, incremento, decremento, velocidade, velMaxima;
		
		//criar objetos
		Bicicleta bicicleta1 = new Bicicleta();
		Scanner sc = new Scanner(System.in);
		
		//obtendo dados
		
		System.out.println("Qual a velocidade maxima desta bicleta?");
		velMaxima = sc.nextInt();
		
		for(int i = 0; i < 3;i++)
		{
			System.out.println("\nQual Marcha esta a bicleta?");
			marcha = sc.nextInt();
			
			System.out.println("Quanto quer acelerar com o bicicleta?\n");
			incremento = sc.nextInt();
			
			System.out.println("Quanto quer Desacelerar com o bicicleta?");
			decremento = sc.nextInt();
	
			//gravando dados
			bicicleta1.setVelocidadeMaxima(velMaxima);
			bicicleta1.setMudarMarcha(marcha);
			bicicleta1.setAcelerar(incremento);
			bicicleta1.setFreiar(decremento);
			
			//lendo dados
			velMaxima = bicicleta1.getVelocidadeMaxima();
			marcha = bicicleta1.getMudarMarcha();
			velocidade = bicicleta1.getVelocidade();
			
			
			bicicleta1.imprimirEstados();
		}
		
	}
}
