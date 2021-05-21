package Hitss.Treinamento.Infra;

public class Controller {
	public static void Play() {
		
		int[] Codigo = new int[4];
		Codigo[1] = 1;
		Codigo[2] = 2;
		Codigo[3] = 3;
		
		String[] Nome = new String[4];
		Nome[1] = "Iphone";
		Nome[2] = "Nootebook";
		Nome[3] = "Play Station 5";
		
		double[] Preco = new double[4];
		Preco[1] = 1000.00;
		Preco[2] = 1000.00;
		Preco[3] = 5000.00;
		System.out.println("");
		System.out.println("        Hitss Treinamento");
		System.out.println("");
		System.out.println("Preazdo(a) Usuário(a), Estamos em Desenvolvimento no momento.");
		System.out.println("");
		System.out.println("Listagem dos Produtos:");
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		for (int i = 1; i < Preco.length; i++) {
			if (Codigo[i] % 2 == 0 && Preco[i] > 1000) {
				Preco[i] = Preco[i] * 1.2;
				System.out.println("Código: " + Codigo[i] + ", Nome: " + Nome[i] + ", Preço: R$" + Preco[i]);
			} else if(Codigo[i] % 2 == 0) {
				Preco[i] = Preco[i] * 1.15;
				System.out.println("Código: " + Codigo[i] + ", Nome: " + Nome[i] + ", Preço: R$" + Preco[i]);
			} else if(Preco[i] > 1000.00) {
				Preco[i] = Preco[i] * 1.1;
				System.out.println("Código: " + Codigo[i] + ", Nome: " + Nome[i] + ", Preço: R$" + Preco[i]);
			} else {
				System.out.println("Código: " + Codigo[i] + ", Nome: " + Nome[i] + ", Preço: R$" + Preco[i]);
			}
					
		}
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
}
