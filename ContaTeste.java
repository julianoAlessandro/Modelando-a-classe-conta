public class ContaTeste {

	public static void main(String[] args) {
		Conta c = new Conta(null, null, 1.260, 0,0);
		c.setNome("Matheus");
		c.setAgencia("Banco do Brasil");
		System.out.println(c.mostrarSaldo());
		c.setIdade(22);
	

	}

}