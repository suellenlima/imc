
public class Principal {

	public static void main(String[] args) {
		
		Paciente suellen = new Paciente(52 , 170);
		Paciente carlos = new Paciente(75 , 169);
		Paciente simone = new Paciente(79 , 168);
	
		suellen.calcularIMC();
		carlos.calcularIMC();
		simone.calcularIMC();
		
		suellen.diagnostico();
		carlos.diagnostico();
		simone.diagnostico();
	}

}
