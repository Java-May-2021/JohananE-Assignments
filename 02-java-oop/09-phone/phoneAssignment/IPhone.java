
public class IPhone extends Phone implements Ringable{
	

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		String prompt = "Unlocking via facial recognition";
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
