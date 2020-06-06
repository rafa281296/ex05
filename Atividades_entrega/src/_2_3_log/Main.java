package _2_3_log;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		String r = JOptionPane.showInputDialog("Escolhas arquivo ou console para imprimir");
		Log log = null;
		
		if(r.equals("arquivo")) {
			JOptionPane.showMessageDialog(null, "opção 'arquivo' aperte f5 e verifique no pacote");		
			log = new LogArquivo();
			
		}else if(r.equals("console")) {
			
			JOptionPane.showMessageDialog(null, "opção 'console'");		
			log = new LogConsole();
		}else {
			JOptionPane.showMessageDialog(null, "voce digitou a opção incorreta!");	
			System.exit(1);
		}

		for (int i = 1; i <= 10; i++)
			log.escreverLog("Contando: " + i);
	}
}
