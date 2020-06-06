package _2_3_log;

public class LogConsole extends Log {

	protected Ferramenta criarFerramentaLog() {
		
		return new FerramentaConsole();
	}
}