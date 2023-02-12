package TelRan.Time.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TelRan.Time.DayOfWeek;

class DayOfWeekTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void valuesTest() {
		DayOfWeek[] days = DayOfWeek.values();
		assertEquals(DayOfWeek.SUN, days[0]);
		assertEquals(7, days.length);
	}
	
	@Test
	void plusDayTest() {
		assertEquals(DayOfWeek.TUE, DayOfWeek.TUE.plusDays(700));
		assertEquals(DayOfWeek.THU, DayOfWeek.TUE.plusDays(2));
	}
	
	@Test
	void minusDayTest() {
		assertEquals(DayOfWeek.SHABBAT, DayOfWeek.TUE.minusDays(3));
		assertEquals(DayOfWeek.TUE, DayOfWeek.TUE.minusDays(700));
		assertEquals(DayOfWeek.MON, DayOfWeek.TUE.minusDays(1));
		
	}
	
	@Test
	void betweenDayTest() {
		assertEquals(4, DayOfWeek.between(DayOfWeek.THU, DayOfWeek.MON));
		assertEquals(3, DayOfWeek.between(DayOfWeek.MON, DayOfWeek.THU));
	
	}

}
