package recursionAssignment;

/**
* The code is about my recursion assignment, and I feel so sorry about the late submition.
* Three parts in total, problem set one, problem set two and problem set three
* @author: Zyaire, Qu
*/

public class Recursion{

  /**
  * This is problem set one, to count how many his in total in a string
  * Return the number
  * Recursion will keep calling the next two index to check if there is a hi
  * @author: Zyaire, Qu
  */

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

  /**
  * This is problem set two, to change any pi to 3.14 in a string
  * Return a string
  * Recursion will keep calling the next two index to check if there is a pi and change it to 3.14
  * if the first two chars does not have a pi, then return the first char + call the next indexs
  * @author: Zyaire, Qu
  */

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

  /**
  * This is problem set three, to check the values in array
  * Return a boolean
  * Recursion will keep calling the next one index to check if there is a right answer
  * @author: Zyaire, Qu
  */

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
