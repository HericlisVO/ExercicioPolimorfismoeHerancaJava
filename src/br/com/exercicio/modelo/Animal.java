package br.com.exercicio.modelo;

public class Animal {
	private String nome;
	private String raca;
	private int idade;
	
	
	
	
	public void emitirSom(){
		System.out.println("Emite o som igual ou parecido a: ");
		if(raca == "cavalo") {
			System.out.println("hiiiii hihihihihihi");
		}else if(raca =="preguica") {
			System.out.println("ahhhhhh aaaah ah");
		}else if(raca == "cachorro") {
			System.out.println("Au Au Au Au Au Au Au ");
		}else {
			System.out.println("Som não identificado!!!");
		}
	}
	
		public void correr() {
			System.out.println("Animal correndo . . .");
		}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
	
	
}
