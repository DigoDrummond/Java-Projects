package files;

import Application.Arq;
import Application.MyIO;

/**
 * Pilha dinamica
 * 
 * @author Max do Val Machado
 * @version 2 01/2015
 */
public class PilhaPrincipal {
	public static void main(String[] args) {
		try {
			System.out.println(" ==== PILHA FLEXIVEL ====");
			Pilha pilha = new Pilha();
			int x1, x2, x3;
			System.out.println(" ==MENU==");
			System.out.println("1-Insert a value.\n2-Remove a value.\n3-List the values.\n4-Exit.");
			int option = MyIO.readInt("Option: ");
			do {
			
			switch(option) {
			
			case 1:
				
				pilha.inserir(0);
				pilha.inserir(1);
				pilha.inserir(2);
				pilha.inserir(3);
				pilha.inserir(4);
				pilha.inserir(5);
				break;
			
			case 2:
				x1 = pilha.remover();
				x2 = pilha.remover();
				x3 = pilha.remover();
			
				break;
			
			case 3:
				pilha.mostrar();
				break;
			
			case 4:	
				Arq.openWrite("pilha.dat");
				
				
				
				Arq.close();
				break;
			}
			}while(option > 0 && option <=4);

			

		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}
}