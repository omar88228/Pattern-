package Design_Pattern_ProtoType;

public class ImpiegatoInterno extends impiegato {
	private String sede ;
	
	
	public ImpiegatoInterno(String nome, String cognome, Indirizio indirizzo, String sede) {
		super(nome, cognome, indirizzo);
		this.sede = sede;
	}

	@Override
	impiegato deepClone() {
		ImpiegatoInterno impiegatoEsterno = null;
		try {
			impiegatoEsterno = (ImpiegatoInterno) this.clone();
		} catch (CloneNotSupportedException e) {

			e.getMessage();
		}

		return impiegatoEsterno;
	}

	@Override
	impiegato shallowCopy() {
		
		return this ;
	}

	@Override
	public String toString() {
		return "ImpiegatoInterno [sede=" + sede + ", toString()=" + super.toString() + "]";
	}

}
