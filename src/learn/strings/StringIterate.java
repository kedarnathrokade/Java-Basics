package learn.strings;

public class StringIterate {

    static void getchar(String str){

        for(int i=0; i<str.length(); i++){

            System.out.println( str.charAt(i));

            System.out.println("");

        }
    }

    public static void main(String[] args) {
        
        String str = "Hello World";
    
        getchar(str);
    
    }

}
