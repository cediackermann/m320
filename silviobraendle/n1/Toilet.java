package silviobraendle.n1;

import java.util.Scanner;

public class Toilet {
    static private final Scanner in = new Scanner(System.in);

    public void readInput() {
        String input = in.nextLine();
        StringBuilder line1 = new StringBuilder();
        StringBuilder line2 = new StringBuilder();
        StringBuilder line3 = new StringBuilder();
        StringBuilder line4 = new StringBuilder();
        StringBuilder line5 = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            convertCharacter(input.charAt(i), line1, line2, line3, line4, line5);
        }
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }

    private void convertCharacter(
            Character c,
            StringBuilder line1,
            StringBuilder line2,
            StringBuilder line3,
            StringBuilder line4,
            StringBuilder line5) {
        if (!CharMap.charMap.containsKey(c)) {
            return;
        }
        String[] charArray = CharMap.charMap.get(c);
        line1.append(charArray[0]);
        line2.append(charArray[1]);
        line3.append(charArray[2]);
        line4.append(charArray[3]);
        line5.append(charArray[4]);
    }
}
