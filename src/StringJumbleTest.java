import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test class to test the jumbledString function
 * @author - Mpumelelo Dlamini
 * */
public class StringJumbleTest {

    @Test
    public void testingStringJumble() {
        // First test case
        String s1 = "wow";
        String testString1 = StringJumble.jumbledString(s1, 3);
        assertEquals("wwo", testString1);

        // Second test case
        String s2 = "another";
        String testString2 = StringJumble.jumbledString(s2, 5);
        assertEquals("ahneort", testString2);

        // Third test case
        String s3 = "Wow Example!";
        String testString3 = StringJumble.jumbledString(s3, 100);
        assertEquals("Wow Example!", testString3);

        // Fourth test case
        String s4 = "Just a long phrase to test your algorithm";
        String testString4 = StringJumble.jumbledString(s4, 100000);
        assertEquals("Just a long phrase to test your algorithm", testString4);

        // Fifth test case
        String s5 = "";
        String testString5 = StringJumble.jumbledString(s5, 10);
        assertEquals("Oops! Looks like there is an error in your inputs.", testString5);
    }
}
