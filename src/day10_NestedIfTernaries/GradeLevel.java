package day10_NestedIfTernaries;

public class GradeLevel {
    public static void main(String[] args) {
        byte lvl=5;
        String result="";

        if(lvl>=1 && lvl<=18){

            if(lvl<=5){
                result="Elementary School";
            }else if(lvl>=6 && lvl<=8){
                result="Middle School";
            }else if(lvl>=9 && lvl<=12){
                result="High School";
            }else if(lvl>=13 && lvl<=16){
                result="College";
            }else{
                result="Grad School";
            }

        }else{
            result="Invalid Level";
        }
        System.out.println(result);

    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */