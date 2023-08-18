package entities;

public class ProgramTelevisor {
	public int canal;
	public int volume = 0;
	public boolean ligado;

	
	
	public void ligarTV() {
		ligado = true;
		canal = 1;
	}
	
	public void desligarTV() {
;
		ligado = false;
	}
	
	public void aumentarCanal() {
		if(canal > 0 && canal < 15) {
			canal ++;
		}else {
			System.out.println("NÃO EXISTEM MAIS CANAIS DISPONIVEIS !");
		}
	}
	public void diminuirCanal() {
		if(canal > 0 && canal < 15) {
			canal --;
		}else {
			System.out.println("NÃO EXISTEM MAIS CANAIS DISPONIVEIS !");
		}
	}
	
	public void aumentarVolume() {
		if(volume >=0 && volume < 16) {
			volume++;
		} else {
			System.out.println("Volume no máximo suportado! ");
		
		}
	} 
	public void diminuirVolume() {
		if(volume >=0 && volume < 16) {
			volume--;
		} else {
			System.out.println("Ja esta no mudo! ");
		}
	}
	
	public void Status() {
		if(ligado == true) {
			System.out.println("Status: TV Ligada");
			System.out.println("Canal: " + canal);
			System.out.println("Volume: " + volume);
			
		} else {
			System.out.println("Status: TV Desligada");
		}
	}
	

} 
