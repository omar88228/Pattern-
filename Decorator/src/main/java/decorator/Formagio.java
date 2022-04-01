package decorator;

import entity.Panino;

public class Formagio extends PaninoDecorator {

	public Formagio(Panino panino) {
		super(panino);
		
	}

	@Override
	public int getPrezzo() {	
		return super.getPrezzo()+5;
	}

	@Override
	public String getIngredienti() {
		return super.getIngredienti()+" + formagio";
	}
	
}
