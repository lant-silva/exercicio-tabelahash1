package control;

import javax.swing.JOptionPane;

import model.Lista;
import model.Morador;

public class ControleApartamento {
	Lista[] andar;
	
	public ControleApartamento() {
		andar = new Lista[10];
		for(int i = 0; i < 10; i++) {
			andar[i] = new Lista();
		}
	}
	
	public void cadastrarMorador(Morador m) throws Exception{
		int hash = m.hashCode();
		Lista morador = andar[hash];

		if(morador.isEmpty()) {
			andar[hash].addFirst(m);
		}else {
			andar[hash].addLast(m);
		}	
	}
	
	public Morador consultarMorador(Morador m) throws Exception{
		int hash = m.hashCode();
		Lista morador = andar[hash];
		for(int i=0;i<morador.size();i++) {
			Morador aux = (Morador) morador.get(i);
			if(m.getNomeMorador().equals(aux.getNomeMorador())) {				
				System.out.println(aux.toString());
			}
		}
		return null;
	}
	
	public Morador removerMorador(Morador m) throws Exception{
		int hash = m.hashCode();
		Lista morador = andar[hash];
		for(int i = 0; i < morador.size();i++) {
			Morador aux = (Morador) morador.get(i);
			if(m.getNomeMorador().equals(aux.getNomeMorador())){
				morador.remove(i);
				break;
			}
		}
		return null;
	}
	
	
	public void listarMorador() throws Exception {
		int size = andar.length;
		for(int i=0;i<size;i++) {
			for(int j=0;j<andar[i].size();j++) {
				Morador aux = (Morador) andar[i].get(j);
				System.out.println(aux.toString());
			}
		}
	}
}
