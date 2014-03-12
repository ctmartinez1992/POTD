package potd;

/**
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