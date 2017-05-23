 
class Palindrome
{
  public static void main(String args[])
  {
    String inputvalue;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter the input a string");
    inputvalue = in.nextLine();
 
    int length  = inputvalue.length();
    int i, start, end, middle;
 
    start  = 0;
    end    = length - 1;
    middle = (start + end)/2;
 
    for (i = start; i <= middle; i++) {
      if (inputvalue.charAt(start) == inputvalue.charAt(end)) {
        start++;
        end--;
      }
      else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println("it is Palindrome");
    }
    else {
      System.out.println("not a palindrome");
    } 	
  }
}