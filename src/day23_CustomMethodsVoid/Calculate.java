package day23_CustomMethodsVoid;

public class Calculate {
    public static void main(String[] args) {
        calculate(14,12, '+');


    }


    public static void calculate(int num1,int num2,char operator){
        String result = "";
        if(operator=='+' || operator=='-' || operator=='/' || operator =='*'){
            switch(operator){
                case '+':
                    result ="" +(num1 + num2);
                    break;
                case '-':
                    result = "" + (num1-num2);
                    break;
                case '/':
                    result = "" + (num1/num2);
                    break;
                case '*':
                    result = "" + (num1*num2);
                    break;
            }
        }else{
            result = "Invalid Operator";
        }
        System.out.println(result);

    }
}
/*

 */