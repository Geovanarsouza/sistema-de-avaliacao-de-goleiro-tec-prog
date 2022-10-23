package sistemaDeGoleiro;

import java.util.ArrayList;

public class Apresentacao {
	public static void espaçamento() {
		System.out.println("\n***************************************************\n");
	}

	public static void main(String[] args) {
		Goleiro goleiro1=new Goleiro(1,"Pratik Skaggs",5,7,8,9,6,6);
		Goleiro goleiro2=new Goleiro(2,"Uehudah Hack",9,6,8,8,7,10);
		Goleiro goleiro3=new Goleiro(3,"Edison Drye",5,8,5,8,10,7);
		Goleiro goleiro4=new Goleiro(4,"Ajani Harding",6,6,5,8,7,6);
		Goleiro goleiro5=new Goleiro(5,"Orazio Hart",5,8,7,9,9,10);
		
		Selecao selecao1=new Selecao("Brasil",goleiro1,goleiro2,goleiro3,goleiro4,goleiro5);
		
		Goleiro goleiro6=new Goleiro(6,"Tristan Karns",9,7,10,7,7,6);
		Goleiro goleiro7=new Goleiro(7,"Niver Glaser",10,9,7,6,5,8);
		Goleiro goleiro8=new Goleiro(8,"Derwyn Devers",10,7,9,5,9,5);
		Goleiro goleiro9=new Goleiro(9,"Tod Phan",10,7,7,5,5,6);
		Goleiro goleiro10=new Goleiro(10,"Eddie Hulse",7,6,5,9,7,5);
		
		Selecao selecao2=new Selecao("Alemanha",goleiro6,goleiro7,goleiro8,goleiro9,goleiro10);
		
		Goleiro goleiro11=new Goleiro(11,"Welford Yepez",5,8,8,7,7,8);
		Goleiro goleiro12=new Goleiro(12,"Rishley Snyder",6,5,6,5,7,6);
		Goleiro goleiro13=new Goleiro(13,"Milo Mccurdy",10,9,8,6,10,9);
		Goleiro goleiro14=new Goleiro(14,"Carden Justus",8,5,8,5,10,7);
		Goleiro goleiro15=new Goleiro(15,"Carlyon Gorby",8,5,8,8,8,6);
		
		Selecao selecao3=new Selecao("Servia",goleiro11,goleiro12,goleiro13,goleiro14,goleiro15);
		
		Goleiro goleiro16=new Goleiro(16,"Mungo Spangler",8,10,9,8,9,5);
		Goleiro goleiro17=new Goleiro(17,"Whitmore Squires",9,10,7,9,9,10);
		Goleiro goleiro18=new Goleiro(18,"Pedrog Mccurdy",8,5,10,5,7,7);
		Goleiro goleiro19=new Goleiro(19,"Ridgley Leo",8,8,8,9,9,9);
		Goleiro goleiro20=new Goleiro(20,"Bolton Tarin",9,8,7,6,9,10);
		
		Selecao selecao4=new Selecao("Croacia",goleiro16,goleiro17,goleiro18,goleiro19,goleiro20);

		Goleiro goleiro21=new Goleiro(21,"Edison Loy",7,7,5,10,10,7);
		Goleiro goleiro22=new Goleiro(22,"Delling Herndon",7,5,5,8,9,9);
		Goleiro goleiro23=new Goleiro(23,"Senichi Iorio",7,7,5,8,10,5);
		Goleiro goleiro24=new Goleiro(24,"Albin Kerner",6,7,8,8,9,9);
		Goleiro goleiro25=new Goleiro(25,"Jivin Justus",9,10,8,7,7,5);
		
		Selecao selecao5=new Selecao("Camarões",goleiro21,goleiro22,goleiro23,goleiro24,goleiro25);
		
		ArrayList<Selecao> selecoes=new ArrayList<Selecao>();
		selecoes.add(selecao1);
		selecoes.add(selecao2);
		selecoes.add(selecao3);
		selecoes.add(selecao4);
		selecoes.add(selecao5);

		for (Selecao selecao : selecoes) {
			for (Goleiro goleiro : selecao.getSelecao()) {
				goleiro.addChute(new Chute(2,4,7));
				goleiro.addChute(new Chute(6,3,6));
				goleiro.addChute(new Chute(9,4,15));
				goleiro.addChute(new Chute(5,6,11));
				goleiro.addChute(new Chute(3,8,13));
				goleiro.addChute(new Chute(3,6,4));
				goleiro.addChute(new Chute(4,5,8));
				goleiro.addChute(new Chute(7,7,14));
				goleiro.addChute(new Chute(8,7,14));
				goleiro.addChute(new Chute(4,6,12));
				goleiro.addChute(new Chute(2,5,15));
				goleiro.addChute(new Chute(7,6,14));
				goleiro.addChute(new Chute(3,8,2));
				goleiro.addChute(new Chute(9,7,10));
				goleiro.addChute(new Chute(10,7,12));
				goleiro.addChute(new Chute(5,4,2));
				goleiro.addChute(new Chute(3,5,13));
				goleiro.addChute(new Chute(10,4,16));
				goleiro.addChute(new Chute(10,5,16));
				goleiro.addChute(new Chute(10,3,14));
				goleiro.addChute(new Chute(9,1,8));
				goleiro.addChute(new Chute(4,8,16));
				goleiro.addChute(new Chute(8,6,14));
				goleiro.addChute(new Chute(7,7,11));
				goleiro.addChute(new Chute(6,0,3));
				goleiro.addChute(new Chute(5,6,7));
				goleiro.addChute(new Chute(3,8,4));
				goleiro.addChute(new Chute(4,6,7));
				goleiro.addChute(new Chute(10,2,13));
				goleiro.addChute(new Chute(7,5,3));
			}	
		}
		
		//QUESTÃO 1 E QUESTÃO 3
		System.out.println("MÉDIA DE CHUTES TOMADOS E DEFENDIDOS DOS GOLEIROS DE CADA SELEÇÃO");

		for (Selecao selecao : selecoes) {
			System.out.println("**********"+selecao.getNome()+"**********");
			System.out.println("********GOL DEFENDIDO****GOL TOMADO");
			for (Goleiro goleiro : selecao.getSelecao()) {
				goleiro.sorteioPosicao();
				System.out.println(goleiro.getNome()+"--"+goleiro.mediaChuteDefendido()+"%"+"-----"+goleiro.mediaGoltomado());
			}
		}
		espaçamento();
		//QUESTÃO 2
		for (Selecao selecao : selecoes) {
			int controle=0;
			for (Goleiro goleiro : selecao.getSelecao()) {
				int aux=goleiro.getPontuacao();
				if(aux>=controle) {
					controle=aux;
				}
			}
			for (Goleiro goleiro : selecao.getSelecao()) {
				if(goleiro.getPontuacao()==controle) {
					System.out.println(selecao.getNome()+"-GOLEIRO TITULAR:"+goleiro.getNome());
				}
				
			}		
		}
		espaçamento();
		//QUESTÃO 4
		int fora=0;
		int traveEsquerda=0;
		int traveDireita=0;
		int traveSuperior=0;
		for (Chute chute : goleiro1.getListaChute()) {
			if(chute.getColuna()==0 || chute.getColuna()==16 || chute.getLinha()==0) {
				fora++;
			}
			if(chute.getColuna()==1) {
				traveEsquerda++;
			}
			if(chute.getColuna()==15) {
				traveDireita++;
			}
			if(chute.getLinha()==1)
				traveSuperior++;
		}
		System.out.println("CHUTES FORA:"+fora+"\nCHUTE NA TRAVE ESQUERDA:"+traveEsquerda+
				"\nCHUTE NA TRAVE DIREITA:"+traveDireita+"\nCHUTE NA TRAVE SUPERIOR:"+traveSuperior);
		espaçamento();
			
     	//QUESTÃO 8
		for (Selecao selecao : selecoes) {
			for (Goleiro goleiro : selecao.getSelecao()) {
				System.out.println("NOME:"+goleiro.getNome()+"--"+"SELEÇÃO:"+selecao.getNome()+"--"+
				"GOLS DEFENDIDOS:"+goleiro.getPontuacao()+"--"+"GOL TOMADO:"+goleiro.golTomado()+"--"+
						"AAG:"+goleiro.getAagTamanho()+"\n");
			}
		}
	
		

	}

}
