package potd;

/**
 * Load Balancer
 * That one side project you've been working on for years has finally taken off and now you need to think about load balancing.
 * To handle the additional load you scale from 1 to 4 servers.
 * Your servers have different specs so they can each handle a different amount of requests.
 * You realize you need some load balancing software to handle this so you set off to build some.
 * Server 1: 357 requests
 * Server 2: 651 requests
 * Server 3: 101 requests
 * Server 4: 230 requests
 * Requests always fill based on which server is most empty (current requests/total capacity).
 * You can decide how to handle ties.
 * Unfortunately, since today is April Fool's Day,
 * someone introduced a bug into your code which is causing an issue with removing requests from each servers' queue.
 * A request is removed from a random server after every 10 requests made to the load balencer.
 * Eventually you won't be able to handle all the traffic you're
 * getting and when this happens simply print out "Happy April Fools" and you're done.
 * 
 *
 * @author Carlos
 */
public class Day20_LoadBalancer {   
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println("Did not have time to do this one! I was on the Insanity Jam 2014");
    }
}