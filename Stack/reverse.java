package Stack;
 import java.util.Stack;
public class reverse {

   


    public static String reverse(String word) {
        Stack<Character> stack = new Stack<>();

        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();  // String concatenation
        }

        return reversed;
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.println(reverse(word));  // Output: olleh
    }
}
    

