package sistemaDeGoleiro;

import java.util.ArrayList;

public class Gol {
	private ArrayList<Quadradinho> listaQuadradinho;

	public Gol() {
		listaQuadradinho=new ArrayList<Quadradinho>();
		for(int linha=0;linha<=8;linha++) {
			for(int coluna=0;coluna<=16;coluna++) {
				Quadradinho q=new Quadradinho(linha,coluna);
				listaQuadradinho.add(q);
			}
		}
	}
//	public String imprimir() {
//		String i=" ";
//		for (Quadradinho quadradinho : listaQuadradinho) {
//			i+=quadradinho.getLinha()+"-"+quadradinho.getColuna();
//			i+="\n";
//		}
//		return i;
//	}
//	public void secao() {
//		for (Quadradinho quadradinho : listaQuadradinho) {
//			//FORA
//			if(quadradinho.getColuna()==0 || quadradinho.getColuna()==16 || quadradinho.getLinha()==0) {
//				quadradinho.setSecao('F');
//			}
//			//TRAVE
//			else if(quadradinho.getColuna()==1 || quadradinho.getColuna()==15 || quadradinho.getLinha()==1) {
//				quadradinho.setSecao('T');
//			}
//			//GOL
//			else {
//				quadradinho.setSecao('G');
//			}
//		}
//	}
}
