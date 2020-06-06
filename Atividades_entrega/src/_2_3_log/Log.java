package _2_3_log;

public abstract class Log {
	
	private Ferramenta log;

	protected abstract Ferramenta criarFerramentaLog();

	public void escreverLog(String mensagem) {
		if (log == null)
			log = criarFerramentaLog();
		log.registrarLog(mensagem);
	}
}

