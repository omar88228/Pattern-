package decorator;

import entity.Panino;

public class PaninoDecorator implements Panino{
	private Panino panino;
	
	public PaninoDecorator(Panino panino) {
		super();
		this.panino = panino;
	}

	@Override
	public int getPrezzo() {
		return this.panino.getPrezzo();
	}

	@Override
	public String getIngredienti() {
		return this.panino.getIngredienti();
	}

}
