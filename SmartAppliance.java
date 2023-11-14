
public class SmartAppliance extends Appliance{
	private double percentSaving;
	private int smartWatts;
	private boolean smartSwitch = false;
	
	public SmartAppliance(int onW,int offW, double savings) {
		super(onW, offW);
		setPercentSaving(savings);
	}
	
	public SmartAppliance(SmartAppliance new1) {
		super(new1.onWatts,new1.offWatts);
		setPercentSaving(new1.percentSaving);
		if(new1.smartSwitch = true) {
			smartSwitch = true;
			if(new1.theSwitch=true) super.theSwitch=true;
			
		}
	}

	public void setPercentSaving(double newSavings) {
		// TODO Auto-generated method stub
		if(newSavings >= 0) {
			percentSaving = newSavings;
		}
		
	}
	
	@Override
	public int getCurrentWatts() {
		if(smartSwitch) {
			return smartWatts;
		}
		return super.getCurrentWatts();
	}

	
	@Override
	public void turnOn() {
		super.turnOn();
	}

	public void smartOn() {
		smartWatts = (int)(super.getCurrentWatts() - (super.getCurrentWatts() *percentSaving));
		smartSwitch = true;
	}
	
	public String toString() {
		return super.toString()+" PercentSaving= "+ percentSaving + " smartOn= " + smartSwitch;
	}
}
