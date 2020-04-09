package opdracht5;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import static opdracht5.Btw.*;

import org.junit.jupiter.api.Test;

class BtwTest {
	@Test
	void test() {
		Btw btw = new Btw();
		btw.setBtw(21);
		btw.setPrijs(.534);
		int getbtw = btw.getBtw();
		double prijs = btw.getPrijs();
		System.out.println(BigDecimal.valueOf(prijs).scale());
		if(BigDecimal.valueOf(prijs).scale() > 2) {
			fail("Meer dan 2 nummers achter de comma");
		}
		assertEquals(btw.getPrijsInclusiefBtw(), (prijs*(getbtw/100)));
	}

}
