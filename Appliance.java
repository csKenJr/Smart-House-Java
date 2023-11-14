
public class Appliance {
	protected int currentWatts,onWatts,offWatts;
	protected boolean theSwitch = false;
	
	public Appliance(int onW, int offW) {
		setOnWatts(onW);
		setOffWatts(offW);
	}
	
	public Appliance(Appliance newApp) {
		setOnWatts(newApp.onWatts);
		setOffWatts(newApp.offWatts);
		if(newApp.theSwitch = true) {
			theSwitch = true;
		}
	}

	public void setOffWatts(int offW) {
		// TODO Auto-generated method stub
		if(offW >= 0) {
			offWatts = offW;
			currentWatts = offW;
			
		}
		
	}

	public void setOnWatts(int onW) {
		// TODO Auto-generated method stub
		if(onW >= 0) {
			onWatts = onW;
		}
	}
	
	public void turnOn() {
		currentWatts = onWatts;
		theSwitch = true;
	}
	
	public int getCurrentWatts() {
		return currentWatts;
	}
	
	public String toString() {
		return "1 on?= "+ theSwitch + " OnW= "+ onWatts + " OffW= "+ offWatts;
	}
	
}
