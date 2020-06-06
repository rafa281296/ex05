package _1_2_exercicio_pizza;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		String data = "06/06/2020";
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		
		Date today = null;
		try {
			today = formater.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		
		Fabrica fabrica = FabricaProducer.getFabrica(FabricaProducer.calz);
		Fabrica fab = FabricaProducer.getFabrica(FabricaProducer.pizz);
		Produto pizza = null;
		Produto pizza2 = null;

		switch(diaSemana) {
		case 2: case 4: case 6:
			pizza = fabrica.getProduto(Pizzaria.calab);
			pizza2 = fab.getProduto(Pizzaria.calab);
			break;
		case 3: case 5: case 7:
			pizza = fab.getProduto(Pizzaria.pres);
			pizza2 = fabrica.getProduto(Pizzaria.pres);
			break;
		default: 
			System.out.println("Domingo não abre");
		}
		if(pizza != null) {
			String sabor_c = pizza.preparar();
			String sabor_p = pizza2.preparar();
			System.out.println(sabor_c +"\n"+ sabor_p );
		}
	}

}
