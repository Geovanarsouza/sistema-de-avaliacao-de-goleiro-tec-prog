package sistemaDeGoleiro;

public class Chute {
	private int forca;
	private Quadradinho posicao;
	
	public Chute(int forca,int linha,int coluna) {
		posicao=new Quadradinho(linha,coluna);
		this.forca=forca;
	}
	public int getLinha() {
		return this.posicao.getLinha();
	}
	public int getColuna() {
		return this.posicao.getColuna();
	}
	public int getForca() {
		return this.forca;
	}
	public int getQuadrante() {
		return this.posicao.getQuadrante();
	}
}
