package potd;

/**
 * Longest Palindrome
 * A few days ago we looked at palindromic numbers.
 * A palindrome is a string that reads the same forwards as it does backwards.
 * Our goal today is to write a function that takes in a string and returns the longest palindrome in that string.
 * For example, the longest palindrome in "Max drives a racecar after work" is "a racecar a".
 * Fun fact: This can be solved in linear time o(n), though a naive, quadratic solution is perfectly fine.
 * 
 *
 * @author Carlos
 */
public class Day8_LongestPalindrome {   
        
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("aabbccbbaa = " + longestPalindrome("aabbccbbaa"));
        System.out.println("kjlfkjabbbbbbbbbbbbbadejgteo = " + longestPalindrome("kjlfkjabbbbbbbbbbbbbadejgteo"));
        System.out.println("135469 = " + longestPalindrome("135469"));
        System.out.println("Max drives a racecar after work = " + longestPalindrome("Max drives a racecar after work"));
        System.out.println("Special case = " + longestPalindrome("arewenotpurenosirpanamasmoodynoriegabragsitisgarbageironydoomsamanaprisoneruptonewera"));
        System.out.println("Special case = " + longestPalindrome("DammitImmadEvilisadeedasIliveGodamIreviledIrisemybedonasunImeltTobenotonemanemanatingissadIpiss"
                                             +"AlasitissolateWhostopstohelpManitishotIminitItellIamnotadevilIlevelMadDogAhsayburningisasadeifiedgulp"
                                             +"InmyhaloofamiredrumtinIerasemanymenOhtobemanasinIsevilinaclamInatrapNoItisopenOnitIwasstuckRatspeedon"
                                             +"hopeElsewheredipsawebBestillifIfillitsebbEwaspiderehWesleepOhnoDeepstarkcutssawitinonepositionPartanimal"
                                             +"canIliveSinisanameBothonemynamesareinitMurderImafoolAhymnIplugdeifiedasasigninrubyashAGoddamlevelIlivedat"
                                             +"OnmailletitinImitOhsitinamplehotspotsOhwetAlossitisalassipIdassignitanameNamenotonebottleminusanodebyme"
                                             +"SirIdeliverImadogEvilisadeedasIliveDammitImmad"));
    }
    
    public static String longestPalindrome(String input) {
        input = input.toLowerCase();
        int r = 0;
        int l = 0;
        String current = "";
        String answer = "";
        for (int mid = 1; mid < input.length() - 1; mid++) {
            l = mid - 1;
            r = mid + 1;
            while (l >= 0 && r < input.length()) {
                if (input.charAt(l) != input.charAt(r)) {
                    break;
                }
                
                current = input.substring(l, (r + 1));
                answer = (current.length() > answer.length()) ? current : answer;
                l--;
                r++;
            }
        }
        
        if(answer.isEmpty()) {
            answer = "has no palindrome!";
        }
        
        return answer;
    }
}
