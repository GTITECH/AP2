package ap2;


import java.util.Random;

public class Defesa {

	Random gerador0 = new Random();
	
	int pesLinha = gerador0.nextInt(17);
	
	Random gerador = new Random();
	int maoEsquerdaColuna = gerador.nextInt(17);
	int maoEsquerdalinha = gerador.nextInt(17);
	
	Random gerador2 = new Random();
	int maoDireitaColuna = gerador2.nextInt(17);
	int maoDireitaLinha = gerador2.nextInt(17);
}
