import java.util.Scanner;
import java.util.Arrays;

public class vowel{
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char input = Character.toLowerCase(new Scanner(System.in).next().charAt(0));
        System.out.println(Arrays.binarySearch(vowels, input) >= 0 ? input + " is a vowel." : input + " is not a vowel.");
    }
}

