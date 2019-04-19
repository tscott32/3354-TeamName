import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class verificationTest {

    @Test
        //test matching name and non-matching password
    void verifyLogin1() {
        verification check = new verification();
        assertEquals("access denied",check.verifyLogin("luis", "32123"));

    }
    @Test
        //test non-matching name and  matching password
    void verifyLogin2() {
        verification check = new verification();
        assertEquals("access denied",check.verifyLogin("phil", "358273"));

    }

    @Test
        //matching name and password
    void verifyLogin3() {
        verification check = new verification();
        assertEquals("access granted",check.verifyLogin("luis", "358273"));

    }
}