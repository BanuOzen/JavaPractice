package day23_CustomMethodsVoid;

public class CalculateGrade {
    public static void main(String[] args) {
    gradeScore(54);

    }
    public static void gradeScore(int score){
        String result = "";

        if(score>=0 && score<=100){
            result =(score>90)? "A" : (score>80)? "B" : (score>70)? "C" : (score>60)? "D":"F";
        }
        System.out.println(result);

    }
}
/*
5. create a method that can calculate the grade of the student based on the score

 */