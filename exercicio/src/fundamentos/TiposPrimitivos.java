package fundamentos;

public class TiposPrimitivos {

	public static void main (String[] args) {
		// Informacoes do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numericos reais
		float salatio = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A'; //ativo
		// char status = '\u0010'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
	}
}
