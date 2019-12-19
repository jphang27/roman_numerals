/*
*if (condition-expression) positive-branch;
*if ((condition-a) && (condition-b)) positive branch;
* if ((condition - a ) || (condition - b)) positive branch;
 */
public class If {
    public static void main(String[] args){
        if(5 > 1) System.out.println("Five is greather than 1");
        if(2 < 4) {
            System.out.println("Two is less than four.");
            System.out.println("Test succeeded");
        }
        
    }
}
