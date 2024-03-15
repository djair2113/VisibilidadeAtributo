package Class;

public class Trocar_Nome {
	public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Assembly",20);
	Pessoa p2= new Pessoa("Cassandra", 17);
	
	p1.setnome("Amor");
	p2.setnome("Paixão");
	
	System.out.println(p1.getnome() + p2.getnome());
	}
	

}
