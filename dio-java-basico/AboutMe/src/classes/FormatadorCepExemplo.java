package classes;

public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("085833");
			System.out.println(cepFormatado);
			
		} catch (CepInvalidoException e) {
			System.out.println("O CEP deve conter apenas 8 dígitos");
		}
	}
	static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "08583-379";
    }
}
