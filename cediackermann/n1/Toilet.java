package cediackermann.n1;

import java.util.Scanner;

public class Toilet {
    public void readInput() {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        for (int i = 0; i < input.length(); i++) {
            convertCharacter(input.charAt(i));
        }
        System.out.println(input);
    }

    private void convertCharacter(Character c) {
        System.out.println(c);
    }
}
