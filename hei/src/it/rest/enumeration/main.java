package it.rest.enumeration;

public class main {

	public static void main(String[] args) {
		imm imm = new imm(Type.valueOf("villa"));
		System.out.println(imm.type);
	}

}
