package potd;

/**
 * Cracking The Primes
 * It's Monday! Hope you all had a good weekend and are set to solve this week's problems.
 * One of the biggest areas in encryption is prime number generation.
 * Eventually our computing power will grow to the point where RSA encryption will either
 * need to be 1 million bits or a new key sharing standard will need to take over.
 * In today's world a standard RSA key is 2048 bits.
 * The key length is determined by the multiplication of 2 prime numbers, thus making it very hard to factor.
 * For today's challenge I have multiplied two small prime numbers together.
 * Your objective is to find the two factors used.
 * The 48 bit key can be bruteforced in a reasonable amount of time whereas the 146 bit
 * key may take some more time and smarter engineering.
 * As always feel free to post any code used in cracking the numbers.
 * Key (48 bit): 153728883468487
 * Key (146 bit): 50134918426382971596395239206900954838888151
 * 
 * I accidently deleted the class, not even sure how i did it, but i don't even feel
 * like starting over, the hell i am. So here's a simple "obfuscated" version in Ruby,
 * with a lot of emphasis in the quotes.
 * 
 * I don't think that you can even understand how frustating it was to see fucking
 * NetBeans just discarding my file with a ctrl-z... I guess it's my fault, i am the one who
 * chose NetBeans to do this task >:(
 * 
 *
 * @author Carlos
 */
public class Day9_CrackingThePrimes {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("require 'prime'\n" +
                           "  def factor(n)\n" + 
                           "  c = n.to_i\n" +
                           "  u = Math.sqrt(c).ceil\n" +
                           "  Prime.each(upbound) {\n" +
                           "    |p|\n" +
                           "    d = c / p\n" +
                           "    if Prime.prime ? d\n" +
                           "      rs = [p, d]\n" +
                           "      return rs\n" +
                           "    end\n" +
                           "  }\n" +
                           "end");
    }
}
