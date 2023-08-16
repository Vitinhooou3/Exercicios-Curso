package estabelecimento;

import copiadora.xerox;
import digitalizadora.Digitalizadora;
import Impressora.deskJet;
import Impressora.laserJet;
import Multifuncional.multifuncional;



public class Estabelecimento {
	public static void main(String[] args) {
		
		xerox xerox = new xerox();
		
		Digitalizadora digitalizadora = new Digitalizadora();
		
		deskJet desk = new deskJet();
		
		laserJet laser = new laserJet();
		
		multifuncional multi = new multifuncional();
		
		digitalizadora.scan();
		xerox.xerocar();
		desk.imprimir();
		laser.imprimir();
		multi.imprimir();
		multi.xerocar();
		multi.scan();
	}
}
