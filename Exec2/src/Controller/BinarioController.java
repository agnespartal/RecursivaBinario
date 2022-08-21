package Controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	
	public String converterBinario (int num) {
		
		if (num == 0) {
			return "";
		} else  {
			int resto = num % 2;
			num = num / 2;
			
			return  converterBinario(num) + resto;
	
		}
	}
}
