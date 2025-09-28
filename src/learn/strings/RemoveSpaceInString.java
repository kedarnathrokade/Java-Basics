package learn.strings;

public class RemoveSpaceInString {

    public static void main(String[] args) {
        String str = " R utik Ka na de";

        for (int i=0 ; i<str.length(); i++){

            if (str.charAt(i) != ' '){

                System.out.print(str.charAt(i));
            }
        }

    }

}
