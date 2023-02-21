public class Conta {
 private String nome;
 private String agencia;
 private double saldo;
 private double saque;
 private int idade;
 Conta(String refNome, String refAgencia, double refSaldo, double refSaque, int refIdade)
 {
	 
	 this.nome = refNome;
	 this.agencia = refAgencia;
	 this.saldo = refSaldo;
	 this.idade = refIdade;
	 this.saque = refSaque;
	 
	 
 }
 // passagem de atributos por parametro
 
public  String getNome() {
	 return nome;
 }

public void setNome(String nome) {
	this.nome = nome;
	System.out.println("Seu novo nome será:"+ nome);
}

public  String getAgencia() {
	 return agencia;
}
 
public void setAgencia(String agencia) {
	this.agencia = agencia;
	System.out.println("Sua nova agencia será:"+ agencia);
}

public  double getSaldo() {
	 return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
	System.out.println("Seu saldo atual é :"+ saldo);
}

public  double getSaque() {
	 return saque;
}

public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	if(idade > 18 && idade <= 100) {
		this.idade = idade;
		System.out.println("Sua  idade é valida");
	}
	else {
		this.idade = idade;
		System.out.println("Idade invalida");
		}
	
}
public void setSaque(double saque) {
	this.saque = saque;
	System.out.println("Voce está retirando um valor no total de  :"+ saque);
}


String mostrarSaldo() {
	return "Seu novo saldo será : " + saldo;
}
String  mostrarSaque() {
	
	return "Voce sacou um valor de : " + saque;
}
 
}// nada pode vim depois dessa chave
