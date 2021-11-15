import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;

        for(int i = 0;i < s.length();i++){
            switch (s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    answer++;
                    break;
            }
        }

        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        //tests each substring of 3 to see if it matches "bob"
        for (int i = 0;i <= s.length() - 3;i++){
            String substring = s.substring(i,i+3);
            if (substring.equals("bob"))
                answer++;
        }

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //establishing the alphabet as a string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //variable initializing
        int alphabetPosA = 0;
        int alphabetPosB = 0;
        int successCount = 0;
        String tempCandidate;
        String bestCandidate = s.substring(0,1);

        /*Main Loop
        checks if i and i+1 are in order
        on success updates temp candidate and if temp candidate is longer updates best candidate
         */
        for (int i = 0;i < s.length() - 1;i++) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == alphabet.charAt(j)) {
                    alphabetPosA = j;
                }
                if (s.charAt(i + 1) == alphabet.charAt(j)) {
                    alphabetPosB = j;
                }
            }
            if (alphabetPosA <= alphabetPosB) {
                tempCandidate = s.substring(i - successCount, i + 2);
                if (tempCandidate.length() > bestCandidate.length()) bestCandidate = tempCandidate;
                successCount++;
            } else {
                successCount = 0;
            }
        }
        return bestCandidate;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("what string?\n");
        String s = scan.nextLine();
        System.out.println("\nNumber of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));
    }
}
