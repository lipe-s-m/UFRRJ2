package POO.EstudandoClasses1;

public class Bicicleta 
{
	//Atributos
	private int velocidade = 0;
	private int marcha = 1;
	private int velMaxima;
	
	
	//Metodos
	
	public void imprimirEstados()
	{
		System.out.printf("\nA bicicleta está a %d Km/h na Marcha %d! a velocidade maxima dela é %d\n", velocidade, marcha, velMaxima);
	}

	
	//Metodos Get e Set
	public int getVelocidade()
	{
		return velocidade;
	}
	
	//Acelerar
	public void setAcelerar(int incremento)
	{
		if(velocidade + incremento > velMaxima)
		{
			System.out.printf("\nUltrapassou o limite de velocidade de %dkm/h!", velMaxima);
			velocidade = velMaxima;
		}
		else
			velocidade += incremento;
//		System.out.println("vrum vrummm\n");
	}
	
	//Freiar
	public void setFreiar(int decremento)
	{
		velocidade -= decremento;
//		System.out.println("freiando\n");
	}
	
	//Mudar Marcha
	public int getMudarMarcha()
	{
		return marcha;
	}
	
	public void setMudarMarcha(int valor)
	{
		marcha = valor;
	}
	
	//Velocidade Maxima
		public int getVelocidadeMaxima()
		{
			return velMaxima;
		}
		
		public void setVelocidadeMaxima(int valor)
		{
			velMaxima = valor;
		}
		
	

}
