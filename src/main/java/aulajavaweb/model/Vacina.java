package aulajavaweb.model;

import java.util.Date;

public class Vacina {

	public enum TipoVacina {
	}
	
	public enum Fabricante {
	}
	
	String nome;
	TipoVacina tipoVacina;
	Fabricante fabricante;
	String lote;
	Date dataVencimento;
	
}
