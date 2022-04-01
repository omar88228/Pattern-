package Design_Pattern_ProtoType;

public abstract class impiegato {
	private String nome ;
	private String cognome;
	private Indirizio indirizzo ;
	
	   abstract impiegato deepClone() ;
	   abstract impiegato shallowCopy();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Indirizio getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizio indirizzo) {
		this.indirizzo = indirizzo;
	}
	public impiegato(String nome, String cognome, Indirizio indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}
	@Override
	public String toString() {
		return "impiegato [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]";
	}
	   
	   
}
