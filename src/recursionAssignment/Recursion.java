package recursionAssignment;

public class Recursion{
//problem set 1
//CODEHI
//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
  public static int countHi(String str){
    if(str.length() < 2) {
      return 0;
      // there is no way a hi in an array length < 2 base case
    }else if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
      // check if this part of string includes hi
		  return 1 + countHi(str.substring(2)); 
      // if yes, return 1 and sub the string from index 2, recursion case here
    } 
    return countHi(str.substring(1));
    // if the string length >2 but there is no hi in first two index, move forward by one to check. so ther is no return values.
  }

  //prob set 2
  public static String changePi(String str){
    if (str.length() < 2){
      // base case, if the length < 2 no way there is a pi
      return str;
      // so just return the string
    }else if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
      // check if there is pi
      return "3.14" + changePi(str.substring(2));
      // if yes, print the 3.14 and continue check by subbing string from index 2
    }
    return str.charAt(0) + changePi(str.substring(1));
    // if not, return the char at index 0, keep searching pi XD
  }


  //prob set 3
  public static boolean array220(int[] intNums, int index){
    if (index >= intNums.length - 1){
      // there is no way that a true comes out when index is greater than length - 1
      return false;
      // base case
    }else if (intNums[index + 1] == intNums[index] * 10){
      // if index*10 equals to index + 1, that is what we want
      return true;
    }
    return array220(intNums, index + 1);
    // if not, just return the same int Num with next index to check if the next index is the right answer.
  }
}
