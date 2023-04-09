package day24_CustomMethodsReturnType;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java java java python python";
        String word = "java";
        int frequency = frequencyOfWord(sentence,word);
        System.out.println(frequency);



    }


    public static int frequencyOfWord(String sentence , String word){

        int javaFrequency = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            javaFrequency++;
        }

        return javaFrequency;



    }

}
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */