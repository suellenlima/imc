
public class Paciente {

	double peso;
	double altura;
	double imc;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura/100;
	}
	
	public void calcularIMC() {
		imc = peso / (altura * altura);
	}
	
	public void diagnostico() {
		if (imc < 16) {
			System.out.println("Baixo peso muito grave");
		}
		if ((imc > 16) && (imc < 16.99)) {
			System.out.println("Baixo peso grave");
		}
		if ((imc > 17) && (imc < 18.49)) {
			System.out.println("Baixo peso");
		}
		if ((imc > 18.50) && (imc < 24.99)) {
			System.out.println("Peso normal");
		}
		if ((imc > 25) && (imc < 29.99)) {
			System.out.println("Sobrepeso");
		}
		if ((imc > 30) && (imc < 34.99)) {
			System.out.println("Obesidade grau I");
		}
		if ((imc > 35) && (imc < 39.99)) {
			System.out.println("Obesidade grau II");
		}
		if (imc >= 40) {
			System.out.println("Obesidade grau III (obesidade mórbida)");
		}
		
	}
	
	public double getImc() {
		return imc;
	}
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	
}
