package TelRan.measure;

public enum WeightUnit {
	
	GR(1), KG(1000), LBS(453.592f), CN(100000), TN(1_000_000);
	
	float value;
	
	private WeightUnit(float value) {
		this.value = value;
	}
	
	public float convert(WeightUnit to, float amount) {
		
		return value * amount / to.value;
	}
	
}
