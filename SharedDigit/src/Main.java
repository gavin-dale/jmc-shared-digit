public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int num1First = num1/10;
        int num1Last = num1%10;
        int num2First = num2/10;
        int num2Last = num2%10;

        if(num1First == num2First){
          return true;
        } else if(num1First == num2Last){
            return true;
        } else if(num1Last == num2First) {
           return true;
        } else if(num1Last == num2Last){
           return true;
        } else {
            return false;
        }

    }
     public static boolean compareNums(int num1, int num2){
         return num1 == num2;
     }

}
