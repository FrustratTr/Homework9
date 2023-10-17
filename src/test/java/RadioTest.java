import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPreviousStation() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}

