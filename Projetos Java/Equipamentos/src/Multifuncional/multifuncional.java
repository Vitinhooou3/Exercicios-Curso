package Multifuncional;

import Impressora.Impressora;
import copiadora.Copiadora;
import digitalizadora.Scanner;

public class multifuncional implements Copiadora, Scanner, Impressora{
	public void xerocar() {
		System.out.println("xerox foda com multi");
	}
	
	public void scan() {
		System.out.println("digitalizando com multi");
	}
	
	public void imprimir() {
		System.out.println("Imprimindo com multi");
	}
}
