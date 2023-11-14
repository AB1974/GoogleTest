public class InterviewQuestions {

    public static void main(String[] args) {

        //Create a method that reverse the given string with following output
        //input:I am from California
        //output ainrofilaC morf ma I
        System.out.println( reverseString("I am from California"));

    }

    public static String reverseString(String input){

        String result="";
        for(int i= input.length()-1; i>=0 ;i--) {
            result += ""+ input.charAt(i);
        }
        return result;
    }


}
