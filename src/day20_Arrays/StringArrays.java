package day20_Arrays;

public class StringArrays {
    public static void main(String[] args) {

        String[] studentsNames = { "Ayse Bozkurt","Merve Caliskan","Seyma Caliskan","Selim Demirer","Emrullah Muhtar","Hüseyin Ay","Necibe Tursun",
                "Ahsen Ustabasi","Eyup Kilic","Muhammed Uslu"};


        for (int i = 0; i < studentsNames.length; i++) {
            String name = studentsNames[i];
            String reverse ="";
            for( int j = name.length()-1; j>=0; j--){
                reverse += name.charAt(j);
            }
            System.out.println(reverse);

        }




    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c


 */