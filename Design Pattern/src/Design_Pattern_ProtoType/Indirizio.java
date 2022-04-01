package Design_Pattern_ProtoType;

public class Indirizio {
   private String via ;
   private String citta ;
   private String provincia ;
public Indirizio(String via, String citta, String provincia) {
	super();
	this.via = via;
	this.citta = citta;
	this.provincia = provincia;
}
public String getVia() {
	return via;
}
public void setVia(String via) {
	this.via = via;
}
public String getCitta() {
	return citta;
}
public void setCitta(String citta) {
	this.citta = citta;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
@Override
public String toString() {
	return "Indirizio [via=" + via + ", citta=" + citta + ", provincia=" + provincia + "]";
}
   
}
