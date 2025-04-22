import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setup(){
        myPass = new Passenger("Mr","Micheal", "O'Leary");
    }

    @Test
    void constructorSuccess(){
        assertEquals("Mr", myPass.getTitle());
        assertEquals("Micheal", myPass.getFirstName());
        assertEquals("O'Leary", myPass.getLastName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mr","Mrs","Ms"})
    void testTilteSuccess(String title){
        Passenger myPass2 = new Passenger(title , "Micheal", "0'Leary");
    }

    @Test
    void testTitleFail(){
        assertThrows(IllegalArgumentException.class, () -> {new Passenger("Dr","Micheal", "O'Leary");});
    }
}
