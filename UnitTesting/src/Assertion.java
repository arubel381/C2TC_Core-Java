import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Assertion {
@Test
void check()
{
	int a=1;
	int b=1;
	assertEquals(a,b);
}

@Test
void check1()
{
	int a=1;
	int b=2;
	assertEquals(a,b);
}

@Test
void check2()
{
	int a=1;
	int b=1;
	assertEquals(a,b);
}

}
