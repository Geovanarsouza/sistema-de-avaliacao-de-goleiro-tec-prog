package sistemaDeGoleiro;

public class Quadradinho {
	//atributos
	private int linha;
	private int coluna;
	private int quadrante;
	private char simbolo;
	
	//metodo construtor
	public Quadradinho(int linha,int coluna) {
		this.linha=linha;
		this.coluna=coluna;
		
		if(linha<5 && coluna<8) {
			this.quadrante=1;
		}
		else if(linha<5 && coluna>7) {
			this.quadrante=2;
		}
		else if(linha>4 && coluna<8) {
			this.quadrante=3;
		}
		else{
			this.quadrante=4;
		}
	}
	public void setSimbolo(char simbolo) {
		this.simbolo=simbolo;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public int getLinha() {
		return this.linha;
	}
	
	public int getColuna() {
		return this.coluna;
	}
	
	public int getQuadrante() {
		return this.quadrante;
	}
	
}
