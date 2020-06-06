package _2_3_log;

public class LogArquivo extends Log {
	
	protected Ferramenta criarFerramentaLog() {
		
		return new FerramentaArquivo();
	}
}
