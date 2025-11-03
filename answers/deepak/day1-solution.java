public class day1-solution {
    static String Spooky(String s )
    {
        StringBuilder result = new StringBuilder();
        if (s.isEmpty()) return null;
        for(int i =0; i<s.length(); i++)  // traversing the String
        {
            char ch = s.charAt(i);  // storing each character of string into ch variable
            if(ch == '_' || ch == '-')  // comparing if it's true we add "~"
            {
                result.append('~');

            } else if (i%2==0) {  //  condition for converting uppercase
                ch = Character.toUpperCase(ch);
                result.append(ch);
            } else {             // converting lowercase
                ch =Character.toLowerCase(ch);
                result.append(ch);
            }
        }
        String ans = new String(result);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Spooky("hello_world"));
        System.out.println(Spooky("spooky-case"));
        System.out.println(Spooky("a_b-c"));
        System.out.println(Spooky("var_1-name"));
    }
}
// my day 1 solution
