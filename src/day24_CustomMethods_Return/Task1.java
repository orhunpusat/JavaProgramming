package day24_CustomMethods_Return;

public class Task1 {
    public static void main(String[] args) {
        String str = "Java java java python python";
        String word = "java";
        frequencyOfWord(str, word);
    }
    public static int frequencyOfWord(String str, String word){
        int frequency = 0;
        String str1 = str.toLowerCase();
        String word1 = word.toLowerCase();
        while (str1.contains(word1)){
            str1 = str1.replaceFirst(word1,"");
            frequency++;
        }
        System.out.println(frequency);
        return frequency;
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