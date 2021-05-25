package recursionAssignment;

public class Recursion{
//problem set 1
//CODEHI
//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
  public static int countHi(String str){
    if(str.length() < 2) {
      return 0;
      //there is no way a hi in an array length < 2 base case
    }else if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
      //check if this part of string includes hi
		  return 1 + countHi(str.substring(2)); 
      //if yes, return 1 and sub the string from index 2, recursion case here
    } 
    return countHi(str.substring(1));
    //if the string length >2 but there is no hi in first two index, move forward by one to check. so ther is no return values.
  }

  //prob set 2
  public static String changePi(String str){
    if (str.length() < 2){
      //base case, if the length < 2 no way there is a pi
      return str;
      //so just return the string
    }else if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
      //check if there is pi
      return "3.14" + changePi(str.substring(2));
      //if yes, print the 3.14 and continue check
    }
    return str.charAt(0) + changePi(str.substring(1));
  }
}
