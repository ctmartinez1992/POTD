package potd;

/**
 * Y2K Age Finder
 * Your goal for today is to write a program that asks a user for their birth year
 * encoded as two digits (eg "90") and for the current year, also encoded as two digits (eg "14").
 * The program should then write out the user's age in years. Example input/output:
 *  Year of Birth: 90
 *  Current year: 14
 *  Your age: 24
 * 
 *
 * @author Carlos
 */
public class Day42_Y2KAgeFinder {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        findAge(92, 14);
    }
    
    public static void findAge(int birth, int current) {
        int age;
        if(birth < current){
            //born post 2k
            age = current - birth;
        } else {
            int pre2k = 100 - birth;
            int post2k = current;
            age = pre2k + post2k;
        }
        
        System.out.println(age + " years old.");
    }       
}