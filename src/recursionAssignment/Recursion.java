package recursionAssignment;

public class Recursion{
//problem set 1
//CODEHI
//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
  public static int countHi(String str){
    if(str.length() < 2) {
      return 0;
    }else if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
		  return 1 + countHi(str.substring(2)); 
    } 
    return countHi(str.substring(1));
  }
}
