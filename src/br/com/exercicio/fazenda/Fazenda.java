package br.com.exercicio.fazenda;

import br.com.exercicio.animais.Cachorro;
import br.com.exercicio.animais.Cavalo;
import br.com.exercicio.animais.Preguica;
import br.com.exercicio.modelo.Animal;

public class Fazenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aqui na Fazenda temos muitos animais e vou lhes apresentar alguns: \n\n");	
		
		Cavalo cavalo1 = new Cavalo();
			
			cavalo1.setIdade(12);
			cavalo1.setNome("Pé de Pano");
			cavalo1.setRaca("cavalo");
			
			System.out.println("Aqui temos o "+ cavalo1.getNome());
			System.out.println("Ele é um belo " + cavalo1.getRaca());
			System.out.println("e tem "+ cavalo1.getIdade()+ " anos de idade! <3\n");
			
			cavalo1.emitirSom();
			cavalo1.Correr();
		Cachorro cachorro = new Cachorro();
		
			cachorro.setIdade(5);
			cachorro.setNome("Tótó");
			cachorro.setRaca("cachorro");
			
			System.out.println("Aqui temos o "+ cachorro.getNome());
			System.out.println("Ele é um belo " + cachorro.getRaca());
			System.out.println("e tem "+ cachorro.getIdade()+ " anos de idade! <3\n");
			
			cachorro.emitirSom();
			cachorro.Correr();
			
			
			Preguica preguica = new Preguica();
			
			preguica.setIdade(6);
			preguica.setNome("soninho");
			preguica.setRaca("preguica");
			
			System.out.println("Aqui temos a "+ preguica.getNome());
			System.out.println("Ela é uma bela " + preguica.getRaca());
			System.out.println("e tem "+ preguica.getIdade()+ " anos de idade! <3\n");
			preguica.emitirSom();
			preguica.Subir();
			
			
			
			Animal rato = new Animal();
			
			rato.setIdade(2);
			rato.setNome("Ratito");
			rato.setRaca("rato");
			
			System.out.println("Aqui temos o "+ rato.getNome());
			System.out.println("Ele é um belo " + rato.getRaca());
			System.out.println("e tem "+ rato.getIdade()+ " anos de idade! <3\n");
			rato.emitirSom();
			rato.correr();
			
		
	}

}
