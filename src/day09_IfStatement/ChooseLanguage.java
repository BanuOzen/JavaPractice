package day09_IfStatement;

public class ChooseLanguage {
    public static void main(String[] args) {

        int num=3; //1~5
        String result="";

        if(num==1){
            result="Hello, thank for your call";
        }else if(num==2){
            result="Hola, gracias para llamar";
        }else if(num==3){
            result="Merhaba, aradiginiz icin tesekkurler";
        }else if(num==4){
            result="Privet, spasibo za vash zvonok";
        }else if(num==5){
            result="Merci ,pour votre appel";
        }else{
            result="Invalid";
        }
        System.out.println(result);

    }
}
/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5,
Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */