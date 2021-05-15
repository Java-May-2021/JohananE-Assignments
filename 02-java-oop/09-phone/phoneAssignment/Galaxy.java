
public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return getRingTone();
		
	}

	@Override
	public String unlock() {
		 String prompt = "Unlocking via finger print";
		 return prompt;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Version: " + getVersionNumber());
		System.out.println("Battery Percentage; " + getBatteryPercentage());
		System.out.println("String Carrier; " + getCarrier());
		System.out.println("Ringtone: "+ getRingTone());
	}
}
	
