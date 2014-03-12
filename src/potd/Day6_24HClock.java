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
            float hourPercentage = minute / 60f;
            float hourHandAngle = ((hour + hourPercentage) / 24f) * 360f;
            float minuteHandAngle = hourPercentage * 360f;
            float difference = Math.abs(hourHandAngle - minuteHandAngle);
            if (difference > 180) {
                System.out.println("Given time [" + hour + "h" + minute + "] the angle is " + (360f - difference));
            } else {
                System.out.println("Given time [" + hour + "h" + minute + "] the angle is " + (difference));
            }
        }
    }
    
    public static boolean validateTime(int hour, int minute) {
        return (((hour >= 0) && (hour < 24)) && ((minute >= 0) && (minute < 60)));
    }    
}