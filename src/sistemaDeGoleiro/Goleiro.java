package sistemaDeGoleiro;

import java.util.ArrayList;
import java.util.Random;

public class Goleiro {
	private int id;
	private String nome;
	private int velocidade;
	private int flexibilidade;
	private int agilidade;
	private int coordenacao;
	private int forca;
	private int equilibrio;
	private int aagTamanho;
	private Quadradinho posicaoInicial;
	private ArrayList<Quadradinho> aag;
	private ArrayList<Chute> listaChute;
	private ArrayList<Quadradinho> pontuacao;
	
	public Goleiro(int id,String nome,int velocidade,int flexibilidade,int agilidade,int coordenacao,int forca,int equilibrio) {
		this.id=id;
		this.nome=nome;
		aagTamanho=((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coordenacao*2)+(forca)+(equilibrio*2))/8;
		listaChute=new ArrayList<Chute>();
	}
	public void addChute(Chute chute) {
		listaChute.add(chute);
	}
	public void sorteioPosicao() {
		Random rand=new Random();
		aag=new ArrayList<Quadradinho>();
		pontuacao=new ArrayList<Quadradinho>();
		for (Chute chute : listaChute) {
			if(chute.getQuadrante()==1) {
				posicaoInicial=new Quadradinho(rand.nextInt(2, 5),rand.nextInt(2, 8));
			}
			else if(chute.getQuadrante()==2) {
				posicaoInicial=new Quadradinho(rand.nextInt(2, 5),rand.nextInt(8, 15));
			}
			else if(chute.getQuadrante()==3) {
				posicaoInicial=new Quadradinho(rand.nextInt(5, 9),rand.nextInt(2, 8));
			}
			else {
				posicaoInicial=new Quadradinho(rand.nextInt(5, 9),rand.nextInt(8, 15));
			}
			int linha=posicaoInicial.getLinha();
			int coluna=posicaoInicial.getColuna();
			int controle=0;
			int aux=aagTamanho;
			int auxlinha=linha-1;
			if(linha>4) {
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						if(coluna<15 && aux>0) {
							aag.add(new Quadradinho(linha,coluna));
							if(chute.getColuna()==coluna && chute.getLinha()==linha) {
								Quadradinho q=new Quadradinho(linha,coluna);
								q.setSimbolo('x');
								pontuacao.add(q);
							}
							linha--;
							controle++;
							aux--;
						}
					}
					linha+=controle;
					controle=0;
					coluna++;
				}
			}
			if(linha<5) {
				for(int i=0;i<4;i++) {
					for(int j=0;j<auxlinha;j++) {
						if(coluna<15 && aux>0) {
							aag.add(new Quadradinho(linha,coluna));
							if(chute.getColuna()==coluna && chute.getLinha()==linha) {
								Quadradinho q=new Quadradinho(linha,coluna);
								q.setSimbolo('x');
								pontuacao.add(q);
							}
							linha--;
							controle++;
							aux--;
					}
				}
					linha+=controle;
					controle=0;
					coluna++;
				}
			}
		}
		
	}
	public int getPontuacao() {
		return pontuacao.size();
	}
	public int golTomado() {
		int aux=pontuacao.size();
		int golTomado=30-aux;
		return golTomado;
	}
	public int getAagTamanho() {
		return this.aagTamanho;
	}
	public ArrayList<Chute> getListaChute(){
		return listaChute;
	}
	public float mediaChuteDefendido() {
		int aux=pontuacao.size();
		float media=(float) ((aux*100)/30);
		return media;
	}
	public float mediaGoltomado() {
		int aux=pontuacao.size();
		int golTomado=30-aux;
		float media=(float) ((golTomado*100))/30;
		return media;
	}
	public String getNome() {
		return this.nome;
	}
}

