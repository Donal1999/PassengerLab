import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
