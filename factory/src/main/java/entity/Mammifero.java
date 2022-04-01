package entity;

public class Mammifero extends Animale {

	private int numeroZampe;

	public Mammifero(String nome, int numeroZampe) {
		super(nome);
		this.numeroZampe = numeroZampe;
	}

	@Override
	public void infoGenerali() {
		System.out.println("il nome delmammifero è : " + this.getNome() + "e possede " + numeroZampe + "zampe");
	}

}
