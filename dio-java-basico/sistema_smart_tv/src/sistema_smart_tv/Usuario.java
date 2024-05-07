package sistema_smart_tv;

public class Usuario {

	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();

		smartTv.ligar();
		System.out.println("TV ligada? " + smartTv.ligada);

		System.out.println("Volume Atual: " + smartTv.volume);

		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();

		System.out.println("Canal Atual: " + smartTv.canal);

		smartTv.mudarCanal(13);

		System.out.println("Canal Atual: " + smartTv.canal);

		smartTv.desligar();
		System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

	}

}
