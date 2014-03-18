package potd;

import java.util.ArrayList;
import java.util.List;

/**
 * Making Change
 * With all the new crypto currencies coming out I think it's time we make our own currency.
 * Since we have such a great community and marketing team our currency really takes
 * off and becomes the official currency of a small large nation.
 * The denominations of our currency are as such:
 * [0.03, .08, .33, .5, 2, 10, 50, 100]
 * If someone comes to our store and asks for change for a $10 note.
 * How many different ways can we offer change for the $10 note assuming with
 * have an infinite amount of all denominations of our currency?
 * 
 *
 * @author Carlos
 */
public class Day10_MakingChange {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        makeChange(10);
    }
    
    public static List<float[]> possibilities = new ArrayList();
    
    public static void makeChange(float amount) {
        int counter = 0;
        float[] v = {0.03f, 0.08f, 0.33f, 0.5f, 2, 10, 50, 100};
        int iM = getSumToValue(0.03f, amount);
        int jM = getSumToValue(0.08f, amount);
        int kM = getSumToValue(0.33f, amount);
        int lM = getSumToValue(0.5f, amount);
        int mM = getSumToValue(2, amount);
        int nM = getSumToValue(10, amount);
        int pM = getSumToValue(50, amount);
        int oM = getSumToValue(100, amount);
        if (v[0] <= amount) {
            for (int i = 0; i < iM; i++) {
                if (v[1] <= amount) {
                    for (int j = 0; j < jM; j++) {
                        if (v[2] <= amount) {
                            for (int k = 0; k < kM; k++) {
                                if (v[3] <= amount) {
                                    for (int l = 0; l < lM; l++) {
                                        if (v[4] <= amount) {
                                            for (int m = 0; m < mM; m++) {
                                                if (v[5] <= amount) {
                                                    for (int n = 0; n < nM; n++) {
                                                        if (v[6] <= amount) {
                                                            for (int p = 0; p < pM; p++) {
                                                                if (v[7] <= amount) {
                                                                    for (int o = 0; o < oM; o++) {
                                                                        float c = (i * v[0]) + (j * v[1]) + (k * v[2]) + (l * v[3]) + (m * v[4]) + (n * v[5]) + (p * v[6]) + (o * v[7]);
                                                                        if ((c == 10) && (c % 1 == 0)) {
                                                                            counter++;
                                                                            System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33] - " + l + "[.5] - " + m + "[2] - " + n + "[10] - " + p + "[50] - " + o + "[100]");
                                                                        }
                                                                    }
                                                                } else {                                                                    
                                                                    float c = (i * v[0]) + (j * v[1]) + (k * v[2]) + (l * v[3]) + (m * v[4]) + (n * v[5]) + (p * v[6]);
                                                                    if ((c == 10) && (c % 1 == 0)) {
                                                                        counter++;
                                                                        System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33] - " + l + "[.5] - " + m + "[2] - " + n + "[10] - " + p + "[50]");
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            float c = (i * v[0]) + (j * v[1]) + (k * v[2]) + (l * v[3]) + (m * v[4]) + (n * v[5]);
                                                            if ((c == 10) && (c % 1 == 0)) {
                                                                counter++;
                                                                System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33] - " + l + "[.5] - " + m + "[2] - " + n + "[10]");
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    float c = (i * v[0]) + (j * v[1]) + (k * v[2]) + (l * v[3]) + (m * v[4]);
                                                    if ((c == 10) && (c % 1 == 0)) {
                                                        counter++;
                                                        System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33] - " + l + "[.5] - " + m + "[2]");
                                                    }
                                                }
                                            }
                                        } else {                                            
                                            float c = (i * v[0]) + (j * v[1]) + (k * v[2]) + (l * v[3]);
                                            if ((c == 10) && (c % 1 == 0)) {
                                                counter++;
                                                System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33] - " + l + "[.5]");
                                            }
                                        }
                                    }
                                } else {
                                    float c = (i * v[0]) + (j * v[1]) + (k * v[2]);
                                    if ((c == 10) && (c % 1 == 0)) {
                                        counter++;
                                        System.out.println(i + "[.03] - " + j + "[.08] - " + k + "[.33]");
                                    }
                                }
                            }
                        } else {
                            float c = (i * v[0]) + (j * v[1]);
                            if ((c == 10) && (c % 1 == 0)) {
                                counter++;
                                System.out.println(i + "[.03] - " + j + "[.08]");
                            }
                        }
                    }
                } else {
                    float c = (i * v[0]);
                    if ((c == 10) && (c % 1 == 0)) {
                        counter++;
                        System.out.println(i + "[.03]");
                    }
                }
            }
        }
        
        System.out.println("Found " + counter + " different possibilities!!!");
    }
    
    public static int getSumToValue(float value, float max) {
        int sum = 0;
        while(max >= 0) {
            sum++;
            max -= value;
        }
        
        return --sum;
    }
}
