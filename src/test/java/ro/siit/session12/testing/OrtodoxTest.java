package ro.siit.session12.testing;

import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class OrtodoxTest {
    MockedStatic<Calendar> mockedCalendar;

    @BeforeEach
    public void beforeEach(){
        mockedCalendar= Mockito.mockStatic(Calendar.class) ;
    }

    @AfterEach
    public void afterEach(){
        mockedCalendar.close();
    }

    @Test
    public void say_hi_should_work_with_true(){
        Person person = new Ortodox();
        // Calendar.isWithin40Days() returns true
        // MockedStatic<Calendar> mockedCalendar= Mockito.mockStatic(Calendar.class) ;
        mockedCalendar.when(()->Calendar.isWithin40Days()).thenReturn(true);

        Assertions.assertEquals("Hristos a inviat!", person.sayHi());

        // mockedCalendar.close();
    }

    @Test
    public void say_hi_should_work_with_false(){
        Person person = new Ortodox();
        // Calendar.isWithin40Days() returns false
        // MockedStatic<Calendar> mockedCalendar= Mockito.mockStatic(Calendar.class) ;
        mockedCalendar.when(()->Calendar.isWithin40Days()).thenReturn(false);

        Assertions.assertEquals("Buna ziua!", person.sayHi());
        // mockedCalendar.close();
    }

    @Test
    public void get_age_works (){
        Assertions.assertEquals(0, (new Ortodox()).getAge());
    }
}
