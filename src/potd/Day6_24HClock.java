package potd;

/**
 * Clock Hands
 * Write a program to find the minimum angle between two hands on a 24 hour clock.
 * For instance, the angle at 6:00 is 90 degrees and the angle at 18:00 is also 90 degrees.
 * At 6:17 the degree is 3.5 and at 18:17 it's 176.5 (hooray for supplementary angles).
 * 
 * For fun, program this one up in a language you've never used before.
 * Here is a list of esoteric languages to help you decide.
 * There are some truly interesting languages on that list.
 * Feel free to use a "standard" language as well if there's one out there that you've been looking to learn.
 * 
 * 
 * In LOLCODE
 * 
 * HAI
 *  I HAS A HOUR
 *  I HAS A MINUTE
 *  GIMMEH HOUR
 *  GIMMEH MINUTE
 *  I HAS A TMP ITZ QUOSHUNT OF MINUTE AN 60
 *  I HAS A HOURTMP ITZ SUM OF HOUR AN TMP
 *  I HAS A HANGLE ITZ PRODUKT OF 360 AN QUOSHUNT OF HOURTMP AN 24
 *  I HAS A MANGLE ITZ DIFF OF TMP AN 360
 *  I HAS A DIFFE ITZ DIFF OF HANGLE AN MANGLE
 * 
 *  BIGGR OF DIFFE AN 180, O RLY?
 *   YA RLY
 *    I HAS A NDIFF ITZ DIFF OF 360 AN DIFFE
 *    VISIBLE NDIFF
 *   NO WAI
 *  VISIBLE DIFFE
 *  OIC
 * KTHXBYE
 * 
 *
 * @author Carlos
 */
public class Day6_24HClock {
        
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        calculateAngle(18, 0);
        calculateAngle(6, 0);
        calculateAngle(6, 17);
        calculateAngle(18, 17);
    }
    
    public static void calculateAngle(int hour, int minute) {
        if(!validateTime(hour, minute)) {
            System.out.println("Time is not valid!!! hour must be >=0 && < 24 and minute must be >=0 && < 60");
        } else {
            float tmp = minute / 60f;
            float diff = Math.abs((((hour + tmp) / 24f) * 360f) - (tmp * 360f));
            if (diff > 180) {
                System.out.println("Given time [" + hour + "h" + minute + "] the angle is " + (360f - diff));
            } else {
                System.out.println("Given time [" + hour + "h" + minute + "] the angle is " + (diff));
            }
        }
    }
    
    public static boolean validateTime(int hour, int minute) {
        return (((hour >= 0) && (hour < 24)) && ((minute >= 0) && (minute < 60)));
    }    
}