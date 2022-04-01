package Design_Pattern_ProtoType;

public class ImpiegatoEsterno  extends impiegato  implements Cloneable {
	private String azienda ;
	

	public ImpiegatoEsterno(String nome, String cognome, Indirizio indirizzo, String azienda) {
		super(nome, cognome, indirizzo);
		this.azienda = azienda;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	@Override
	impiegato deepClone() {
		ImpiegatoEsterno impiegatoEsterno = null;
		try {
			impiegatoEsterno =  (ImpiegatoEsterno) this.clone();
		} catch (CloneNotSupportedException e) {

			System.out.println(e);
		}

		return impiegatoEsterno;
	}

	@Override
	impiegato shallowCopy() {
		ImpiegatoEsterno impiegatoEsterno = this;
		return impiegatoEsterno;
	}

	@Override
	public String toString() {
		return "ImpiegatoEsterno [azienda=" + azienda + ", toString()=" + super.toString() + "]";
	}

}
