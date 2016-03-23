package nuts.hiro.cap4;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario funcionario) {
	
		//if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
		//if(funcionario.getSalario() > 3000) return 3200.0;
		//return 1350;
		//}
		//return 425.0;

		if(funcionario.getSalario() > 3000){
			return funcionario.getSalario() * 0.8;
		}
		if(funcionario.getSalario() < 1000){
			return funcionario.getSalario() * 0.85;
		}
		
		return funcionario.getSalario() * 0.9;
	
	}

}
