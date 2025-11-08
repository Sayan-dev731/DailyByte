import java.util.Scanner;
public class KUMARISONALIUPADHYAY_6606175 {
 public static void main(String[] args){
 Scanner scan =new Scanner(System.in);
 System.out.println("enter a sentence:");
 String sentence = scan.nextLine();
 int count =countwords(sentence);
 System.out.println("numbers of words:"+ count);
 scan.close();
 }
 private static int countwords(String sentence) {
    //if this is empty....
  if(sentence ==null || sentence.isEmpty()){
    return 0;
  }
  int count = 0;
  boolean insidedata =false;
  for(int i=0;i<sentence.length();i++){
    char ch = sentence.charAt(i);
    //if there is no space....
  if (ch != ' ' && !insidedata) {
        insidedata = true;
        count++;
    }
    //if there is space....
    else if( ch==' '){
        insidedata= false;
    }
  }
  return count;
 }
    
}