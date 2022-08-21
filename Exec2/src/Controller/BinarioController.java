package Controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	
	public String converterBinario (int num) {
		//Condição de parada
		if (num == 0) {
			return "";
		} else  {
			int resto = num % 2;
			num = num / 2;
			
			return  converterBinario(num) + resto;
			//armazena o valor do resto da divisão do numero inicial por 2, e faz o divisão do numero inicial por 2, no final retorna o resto da divisão
			// concatenando os valores da ultima divisão até a primeira
		}
	}
}
