package _1_2_exercicio_pizza;

public class FabricaProducer {
	
	public static final int pizz = 1;
	public static final int calz = 2;
	
	private FabricaProducer() {
		throw new AssertionError();
	}
	
	public static Fabrica getFabrica(int tipo) {
		switch(tipo) {
		case pizz:
			return new Pizzaria();
		case calz:
			return new Calzoneria();
		}
		return null;
	}

}
