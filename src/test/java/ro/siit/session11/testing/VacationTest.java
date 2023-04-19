package ro.siit.session11.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class VacationTest {

    @Test
    public void sleepIn_non_weekday_non_vacation(){
        Vacation vacation = new Vacation();
        Assertions.assertTrue(vacation.sleepIn(false, false));
    }

    @Test
    // @Disabled
    public void sleepIn_weekday_non_vacation(){
        Vacation vacation = new Vacation();
        Assertions.assertFalse(vacation.sleepIn(true, false));
    }

    @Test
    // @Disabled
    public void sleepIn_non_weekday_vacation(){
        Vacation vacation = new Vacation();
        Assertions.assertTrue(vacation.sleepIn(false, true));
    }

    @Test
    //  @Disabled
    public void sleepIn_weekday_vacation(){
        Vacation vacation = new Vacation();
        Assertions.assertTrue(vacation.sleepIn(true, true));
    }
}
