package Class;

public class Pessoa{
	private String nome;
	private int idade;
	
	public Pessoa(String nome,int idade) {
	  this.nome = nome;
	  this.idade = idade;
	}
    public String getnome() {
      return nome;
    }
    public void setnome(String nome) {
     if (this.idade > 18 ) {
    	 this.nome = nome;
     }
    }
    public int getidade() {
    	return idade;
    	
    }
    
    public void setidade(int idade) {
    	this.idade = idade;
    	
    }
}
