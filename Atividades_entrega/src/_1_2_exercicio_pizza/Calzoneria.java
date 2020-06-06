package _1_2_exercicio_pizza;

public class Calzoneria implements Fabrica {

	public static final int calab = 1;
	public static final int pres = 2;
	
	@Override
	public Produto getProduto(int tipo) {
		switch(tipo) {
		case calab: 
			return new CalzoneCalabresa();
		case pres:
			return new CalzonePresunto();
		}
		return null;
	}
}
