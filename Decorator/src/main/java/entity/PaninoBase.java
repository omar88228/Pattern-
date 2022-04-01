package entity;

public class PaninoBase implements Panino {

	@Override
	public int getPrezzo() {
		return 10;
	}

	@Override
	public String getIngredienti() {
		return "pane + humburger";
	}
	
}
