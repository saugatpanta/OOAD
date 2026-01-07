package jumper;

import java.sql.SQLOutput;

public class Result {
    static int[] marks = {50,50,50,50,50};

    public static String checkResult() {
        int totalMarks = 0;
        float percentage = 0.0F;

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i] ;
        }

        percentage = ((float) totalMarks / 500) * 100;

        if(percentage >= 60){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        System.out.println("Your Result is " + checkResult());
    }
}
