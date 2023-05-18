package view;
import control.ControleApartamento;
import model.Morador;

public class Main {
	public static void main(String[] args) {
		ControleApartamento cont = new ControleApartamento();
		
		Morador m = new Morador("Paulo", 103, "3IC123", "Amarelo", "Camaro");	
		Morador m1 = new Morador("Joao", 105, "2IE849", "Azul", "WRX Imprenza");	
		Morador m2 = new Morador("Pedro", 209, "8MS143", "Preto", "Prius");	
		Morador m3 = new Morador("Miguel", 315, "1ML423", "Vermelho", "Yaris");	
		
		
		
		
		
		Morador ney = new Morador("",105,"","","");
		
		try {
			cont.cadastrarMorador(m);
			cont.cadastrarMorador(m2);
			cont.cadastrarMorador(m1);
			cont.cadastrarMorador(m3);
			cont.listarMorador();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
