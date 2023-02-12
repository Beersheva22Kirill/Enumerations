package TelRan.Time;

public enum DayOfWeek {
	SUN, MON, TUE, WED,THU, FRI, SHABBAT;
	
	public DayOfWeek plusDays(int days) {
		DayOfWeek res = null;
		if (days < 0) {
			res = minusDays(-days);
		} else {
			int seqNumCurrent = ordinal();
			int seqNumRes = (seqNumCurrent + days) % 7;
			res = values()[seqNumRes];
		}
		return res;
	}

	public DayOfWeek minusDays(int days) {
		DayOfWeek res = null;
		if (days < 0) {
			res = plusDays(-days);
		} else {
			int seqNumCurrent = ordinal();
			int seqNumRes = (seqNumCurrent - days) % 7;
			if (seqNumRes < 0) {
				seqNumRes += 7;
			}
			res = values()[seqNumRes];
		}
		return res;
	}
	
	static public int between(DayOfWeek day1, DayOfWeek day2) {
		int res = day1.ordinal() - day2.ordinal();
		if (res <= 0) {
			res += 7;
		}
		return res;
	}
}
