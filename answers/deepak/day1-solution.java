public class Solution {
    static String Spooky(String s )
    {
        StringBuilder result = new StringBuilder();
        if (s.isEmpty()) return "String is empty";
        String str = s.replaceAll("[^a-z0-9A-Z]","");
        for(int i =0; i<str.length(); i++)  // traversing the String
        {
            char ch = str.charAt(i);  // storing each character of string into ch variable
            if (i%2==0) {  //  condition for converting uppercase
                ch = Character.toUpperCase(ch);
                result.append(ch);
            } else {             // converting lowercase
                ch =Character.toLowerCase(ch);
                result.append(ch);
            }
        }
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == '_' || s.charAt(i) == '-')
            {
                result.insert(i,'~');
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
