import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest{

@Test

public void testToCalculateSafePeriod(){

int cycleLength = 28;

MenstrualApp menstrual = new MenstrualApp();
MenstrualApp.calculateSafePeriods(cycleLength);
