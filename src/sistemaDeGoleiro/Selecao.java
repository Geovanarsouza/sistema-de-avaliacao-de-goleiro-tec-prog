package sistemaDeGoleiro;

import java.util.ArrayList;

public class Selecao {

	private ArrayList<Goleiro> selecao;
	private String nome;
	
	public Selecao(String nome,Goleiro a,Goleiro b,Goleiro c,Goleiro d,Goleiro e) {
		selecao=new ArrayList<Goleiro>();
		selecao.add(a);
		selecao.add(b);
		selecao.add(c);
		selecao.add(d);
		selecao.add(e);
		this.nome=nome;
	}
	public ArrayList<Goleiro> getSelecao(){
		return selecao;
	}
	public String getNome() {
		return this.nome;
	}
}

