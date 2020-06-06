package _2_1_nomes;

public class NomePrimeiroParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new NomePrimeiro();
	}

}
