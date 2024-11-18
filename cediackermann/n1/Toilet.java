package cediackermann.n1;

import java.util.HashMap;
import java.util.Scanner;

public class Toilet {
    static private Scanner in = new Scanner(System.in);
    static private HashMap<Character, String[]> characters = new HashMap<>();

    public Toilet(){
        Toilet.characters.put('A', new String[]{
            "   A   ",
            "  A A  ",
            " AAAAA ",
            " A   A ",
            " A   A "
        });
    
        Toilet.characters.put('B', new String[]{
            " BBBBB ",
            " B   B ",
            " BBBBB ",
            " B   B ",
            " BBBBB "
        });
    
        Toilet.characters.put('C', new String[]{
            "  CCCCC",
            " C     ",
            " C     ",
            " C     ",
            "  CCCCC"
        });
    
        Toilet.characters.put('D', new String[]{
            " DDDD  ",
            " D   D ",
            " D   D ",
            " D   D ",
            " DDDD  "
        });
    
        Toilet.characters.put('E', new String[]{
            " EEEEE ",
            " E     ",
            " EEEE  ",
            " E     ",
            " EEEEE "
        });
    
        Toilet.characters.put('F', new String[]{
            " FFFFF ",
            " F     ",
            " FFFF  ",
            " F     ",
            " F     "
        });
    
        Toilet.characters.put('G', new String[]{
            "  GGGGG",
            " G     ",
            " G  GG ",
            " G   G ",
            "  GGGG "
        });
    
        Toilet.characters.put('H', new String[]{
            " H   H ",
            " H   H ",
            " HHHHH ",
            " H   H ",
            " H   H "
        });
    
        Toilet.characters.put('I', new String[]{
            " IIIII ",
            "   I   ",
            "   I   ",
            "   I   ",
            " IIIII "
        });
    
        Toilet.characters.put('J', new String[]{
            " JJJJJ ",
            "     J ",
            "     J ",
            " J   J ",
            "  JJJ  "
        });
    
        Toilet.characters.put('K', new String[]{
            " K   K ",
            " K  K  ",
            " KKK   ",
            " K  K  ",
            " K   K "
        });
    
        Toilet.characters.put('L', new String[]{
            " L     ",
            " L     ",
            " L     ",
            " L     ",
            " LLLLL "
        });
    
        Toilet.characters.put('M', new String[]{
            " M   M ",
            " MM MM ",
            " M M M ",
            " M   M ",
            " M   M "
        });
    
        Toilet.characters.put('N', new String[]{
            " N   N ",
            " NN  N ",
            " N N N ",
            " N  NN ",
            " N   N "
        });
    
        Toilet.characters.put('O', new String[]{
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  "
        });
    
        Toilet.characters.put('P', new String[]{
            " PPPPP ",
            " P   P ",
            " PPPPP ",
            " P     ",
            " P     "
        });
    
        Toilet.characters.put('Q', new String[]{
            "  QQQ  ",
            " Q   Q ",
            " Q   Q ",
            " Q  QQ ",
            "  QQQQ "
        });
    
        Toilet.characters.put('R', new String[]{
            " RRRRR ",
            " R   R ",
            " RRRRR ",
            " R  R  ",
            " R   R "
        });
    
        Toilet.characters.put('S', new String[]{
            "  SSSSS",
            " S     ",
            "  SSS  ",
            "     S ",
            " SSSSS "
        });
    
        Toilet.characters.put('T', new String[]{
            " TTTTT ",
            "   T   ",
            "   T   ",
            "   T   ",
            "   T   "
        });
    
        Toilet.characters.put('U', new String[]{
            " U   U ",
            " U   U ",
            " U   U ",
            " U   U ",
            "  UUU  "
        });
    
        Toilet.characters.put('V', new String[]{
            " V   V ",
            " V   V ",
            " V   V ",
            "  V V  ",
            "   V   "
        });
    
        Toilet.characters.put('W', new String[]{
            " W   W ",
            " W   W ",
            " W W W ",
            " WW WW ",
            " W   W "
        });
    
        Toilet.characters.put('X', new String[]{
            " X   X ",
            "  X X  ",
            "   X   ",
            "  X X  ",
            " X   X "
        });
    
        Toilet.characters.put('Y', new String[]{
            " Y   Y ",
            "  Y Y  ",
            "   Y   ",
            "   Y   ",
            "   Y   "
        });
    
        Toilet.characters.put('Z', new String[]{
            " ZZZZZ ",
            "    Z  ",
            "   Z   ",
            "  Z    ",
            " ZZZZZ "
        });
    }

    public void readInput() {
        String input = Toilet.in.nextLine();
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
        if (!Toilet.characters.containsKey(Character.toUpperCase(c))) {
            return;
        }
        String[] charArray = Toilet.characters.get(Character.toUpperCase(c));
        line1.append(charArray[0]);
        line2.append(charArray[1]);
        line3.append(charArray[2]);
        line4.append(charArray[3]);
        line5.append(charArray[4]);
    }

}
