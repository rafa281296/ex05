package _2_1_nomes;

public class Sobrenome_nome implements NameParser {

	@Override
	public Nome parse(String s) {
		int branco = s.indexOf(",");
		String sobrenome = s.substring(0, branco);
		String nome = s.substring(branco+2);
		
		
		return new Nome(nome, sobrenome) ;
	}

}
