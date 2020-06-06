package _2_3_log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FerramentaArquivo extends Ferramenta {
	
	private File arquivoLog;

	public FerramentaArquivo() {
		String pacote = "C:\\Users\\Top\\teste\\Atividades_entrega\\src\\_2_3_log";
		arquivoLog = new File(pacote, "log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.out.println("Não criou o log:\n" + e);
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) {
		try {
			FileWriter writer = new FileWriter(arquivoLog, true);
			writer.write(mensagem + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Não escreveu no arquivo de log:\n" + e);
			System.exit(1);
		}
	}
}
