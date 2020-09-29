package labsheet1;
import java.util.Scanner;


public class TextAnalyser {
    public static void main(String[] args) {
        String text, ShortestText="";
        char ch, nextCh=' ';
        int i =1, j=0, characters=0, words, lowercaseVowels=0, NoOfWords=0, NoOfTimesEd=0;


        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter piece of text " + i + ": ");
            text = input.nextLine();

            words = 0;


            while (j < text.length()) {
                ch = text.charAt(j);

                if (j < text.length() - 1)
                    nextCh = text.charAt(j + 1);


                if (ch == 'a'|| ch == 'e' || ch =='i' || ch == 'u'
                        || ch == 'o')

                lowercaseVowels++;
                if (ch == ' ')
                    NoOfWords++;

                if (ch == 'e' && nextCh == 'd')
                    NoOfTimesEd++;
                j++;

                System.out.print("******Text Data******"
                        +"\n\nNumber of characters: " + characters  +
                        "\nNumber of lowercase vowels: " + lowercaseVowels +
                        "\nNumber of words: " + NoOfWords +
                        "\nNumber of times ed appears in the text: " + NoOfTimesEd);


            }
                if (i == 1)
                    ShortestText = text;
                if (text.length() < ShortestText.length())
                    ShortestText = text;

                NoOfWords += (words + 1);

                i++;



        }while(i<=3);







        System.out.println("*****Overall Results*****"
                + "\n\nShortest piece of text: " + ShortestText
                +"\nAverage number of words: " + String.format("%.0f",(NoOfWords/3f)) + "\n\n");

}





    }


