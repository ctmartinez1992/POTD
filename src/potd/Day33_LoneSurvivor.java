package potd;

/**
 * The Lone Survivor
 * There are 1,500 loyal servants sitting around the king's table when they decide to play a little game.
 * The 1st servant gets a sword and kills the 2nd servant.
 * He then gives the sword to the 3rd servant, who then kills the 4th servant and then gives the sword to the 5th.
 * This continues so that the 1,499th servant kills the 1,500th servant and gives the sword back to the 1st servant.
 * Now the 1st servant kills the 3rd and gives the sword to the 5th.
 * This process continues until only one servant remains. Which number servant is the lone survivor?
 * 
 *
 * @author Carlos
 */
public class Day33_LoneSurvivor {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        System.out.println(loneSurvivor(1500));
    }  

    public static int loneSurvivor(int numberOfServants) {        
        NodeLL servantsInBattle = new NodeLL(1);
        servantsInBattle.next = servantsInBattle;
        for(int i = 2; i <= numberOfServants; i++) {
            servantsInBattle.append(i);
        }
        
        NodeLL cursor = servantsInBattle;
        while (cursor.next != cursor) {
            cursor.deleteNext();
            cursor = cursor.next;
        }
        
        return cursor.value;
    }

    public static class NodeLL {
        
        public int value;
        public NodeLL next = null;

        public NodeLL(int value) {
            this.value = value;
        }

        public void append(int value) {
            NodeLL start = this;
            NodeLL end = new NodeLL(value);
            NodeLL node = this;
            while (node.next != start) {
                node = node.next;
            }
            
            node.next = end;
            end.next = start;
        }

        public void deleteNext() {
            this.next = this.next.next;
        }
    }      
}