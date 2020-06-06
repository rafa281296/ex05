package _3_1_incremental;

class Incremental {
	
	private static Incremental singletonInstance;
	public static int count=1;
	public static int numero;

	private Incremental() {
		numero = count+count;
	}

	synchronized static Incremental getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Incremental();
		}
		return singletonInstance;
	}

	public String toString() {
		return "Incrementando: " + numero;
	}
}
