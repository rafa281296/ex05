package _2_1_nomes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Rafael Rocha");
		nomes.add("Jose Rocha");
		nomes.add("Angela, Molon");
		nomes.add("Isaben, Cristina");
		NameParserCreator parser;
		
		for (String nome: nomes) {
			if(nome.contains(",")) {
				
				parser = new Sobrenome_nomeParser();
			}else {
				parser = new NomePrimeiroParser();
			}
			parser.gravarNome(nome);
		}
	}

}
