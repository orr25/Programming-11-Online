import java.util.Scanner;

public class Main {
    //Code your solution to problem number one here
    // This method returns the number of vowels in the string input
    static int problemOne(String s) {
        //TODO
        int count = 0;   // Initialize the count variable
        for (int i = 0; i < s.length(); i++) { //go through every character in the string provided
            if (s.charAt(i) == ('a') || // if the character is equal to a,e,i,o,u
                    s.charAt(i) == ('e') ||
                    s.charAt(i) == ('i') ||
                    s.charAt(i) == ('o') ||
                    s.charAt(i) == ('u'))
                count++; //then, increment the counter
        }
        return count; //return the final count after we gone through every character
    }

    //Code you problem number two here
    // This method counts the number of times that the string bob shows up in the input string
    static int problemTwo(String s) {
        //TODO
        int count = 0; //initialize the count value
        for (int i = 0; i < s.length() - 2; i++) { //go through every character up until two characters before the end
            if (s.charAt(i) == ('b') && // if the current character is a b
                    s.charAt(i + 1) == ('o') && // and the next character is a o
                    s.charAt(i + 2) == ('b')) // and the next character is a b
                count++; // then increment the counter
        }
        return count; // return the final count
    }

    //Code your solution to problem number 3 here
    // this method takes a string and finds the longest substring where it is in alphabetical order
    static String problemThree(String s) {
        //TODO
        // declare an array to hold one string for every character in s
        StringBuilder[] words = new StringBuilder[s.length()];

        for (int i = 0; i < s.length(); i++) { //loop through every character in s
            words[i] = new StringBuilder("");   //initialize the string with the first character
            words[i].append(s.charAt(i));
            for (int j = i; j < s.length() - 1; j++) { //loop through the remaining characters
                char current = s.charAt(j); //store the current character
                char next = s.charAt(j + 1); //store the next character
                if (current <= next) // if the current character is alphabetically before the next character
                    words[i].append(next); //then append this character to the existing string
                else break; //otherwise stop the loop
            }
        }

        for (StringBuilder w : words) { //print out all the substrings just for debugging purposes
            System.out.println(w);
        }

        int index = 0; //initialize an index to the first string
        int length = words[0].length(); //initialize the length to be the length of the first string
        for (int i = 1; i < words.length; i++) { // loop through all the words in the array
            System.out.println(words[i]); //print the string to help us debug
            if (words[i].length() > length) { //if the new string is bigger than the old string
                index = i; // then set the index to this string
                length = words[i].length(); //also set the length to this new (longer) length
            }
        }
        return words[index].toString(); //return the string thats the longest
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        int result = problemOne("iueuaondjmhoiuxjee");
        System.out.println("The answer to problem one is " + result);
        result = problemTwo("iuebobobondbobuxjee");
        System.out.println("The answer to problem two is " + result);
        String longest = problemThree("smpmqblmgaanxmlcvhw");
        System.out.println("The answer to problem three is " + longest);

    }
}
