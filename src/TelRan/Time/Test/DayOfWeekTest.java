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

}
