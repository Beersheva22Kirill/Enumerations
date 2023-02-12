package TelRan.measure;

public class Length implements Comparable<Length> {
	private float amount;
	private LengthUnit lengthUnit;
	
	
	public Length(float amount, LengthUnit lenghtUnit) {
		super();
		this.amount = amount;
		this.lengthUnit = lenghtUnit;
	}
	
	@Override
	/**
	 * equals two Length objects according to LengthUnit and amount
	 * 10m == 10000mm
	 */
	public boolean equals(Object obj) {
		Length object = (Length) obj;

		return object.amount == (convert(object.lengthUnit).amount);
	}

	@Override
	/**
	 * 
	 * @param o
	 * @return < 0 "this" object less than "o" object,
	 *  > 0 "this" object greater than "o" object,
	 *  == 0 "this" object equals "o" object,
	 */
	public int compareTo(Length o) {
		int res = 0;
		if(convert(o.lengthUnit).amount < o.amount) {
			res = -1;
		} else if (convert(o.lengthUnit).amount > o.amount) {
			res = 1;
		}
		return res;
	}
	/**
	 * 
	 * @param unit
	 * @return new Length object with a given LengthUnit
	 * example, convert(LengthUnit.M) returns Length in meters 
	 */
	public Length convert(LengthUnit unit) {
		float value = amount * lengthUnit.value/unit.value;
		Length res = new Length(value, unit);
		
		return res;
	}
	
	@Override
	/**
	 * returns string with amount and length unit pinned to amount with no space
	 * Example: 20.0M (string expression of Length object presenting 20 meters)
	 */
	public String toString() {
		
		return amount + lengthUnit.name();
	}

	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return lengthUnit;
	}
	
	
}
