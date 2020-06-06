package _2_1_nomes;

public class Sobrenome_nomeParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new Sobrenome_nome();
	}

}
