package final1531;

public class homeOwner {

	public static void main(String[] args) {
		
		tv tele = new tv("String","String");
		tele.powerOn();
	    tele.powerOff();
		tele.changeChannel(2);
		tele.changeVolume(2);
		 tele.printStatus ();
		 
		 audioSystem audio=new audioSystem("String","String");
		 audio.powerOn();
		 audio.powerOff();
		 audio.changeVolume(3);
		 
		 homeLights home = new homeLights("String","String");
		 home.powerOn();
		 home.powerOff();
		 
		 washing_machine wash = new washing_machine("String","String");
		 wash.powerOn();
		 wash.powerOff();
		 wash.changeMode("quick");
		 
		
		

	}

}
