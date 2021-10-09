package metodo.sem.retorno;

public class Conta {
	int numeroConta;
	String titular;
	double saldo;
	
	public void sacar(double valor) {
		saldo = saldo - valor;
		// saldo-=valor;
	}

	public void depoistar(double valor) {
		saldo = saldo + valor;
		//saldo += valor;
	}
}
