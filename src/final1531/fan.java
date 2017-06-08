package final1531;

public class fan {
	String on;
	String off;
	boolean power = true;
	public fan(String on,String off){
	    this.on = on;
	    this.off=off;
	 }
	public void setcontrols_on ( String on ) {
		   this.on = on;
		} 
	public void getcontrols_on ( String on ) {
		   this.on = on;
		}
	public void setcontrols_off ( String off ) {
		   this.off = off;
		} 
	public void getcontrols_off ( String off ) {
		   this.off = off;
		}
	 void powerOn(){ 
	        power = true;   }
	 void powerOff(){
		 power=false;
	 }

}
