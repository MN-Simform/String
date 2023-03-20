public class Main {
    static String str1;
    static String str2;
    static StringBuilder sBuilder;
    static StringBuffer sBuffer;
    public static void main(String[] args) {

        str1 = "  String Using Literal  ";
        str2 = new String("  String Using New Keyword  ");
        sBuilder = new StringBuilder("  String Builder ");
        sBuffer = new StringBuffer("  String Buffer ");

        System.out.println("Initialised String Variables : ");
//        Printing Strings Values in Console
        System.out.println(str1 + "\n" + str2 + "\n" + sBuffer + "\n" + sBuffer);
        System.out.println();

//        Append Lines in StringBuilder
        sBuilder.append("Line 1 ").append("Line 2").append("Line 3").append("Line 4").append("Line 5");
        System.out.println("Appended String Builder : " + sBuilder);

//        Append Lines in StringBuffer
        sBuffer.append("Line 1 ").append("Line 2").append("Line 3").append("Line 4").append("Line 5");
        System.out.println("Appended String Buffer : " + sBuffer);
        System.out.println();

//        Converting to Uppercase and Trimming Leading and Trailing Whitespaces
        System.out.println(str1.toUpperCase().trim());
        System.out.println(str2.toUpperCase().trim());
        System.out.println(sBuilder.toString().toUpperCase().trim());
        System.out.println(sBuffer.toString().toUpperCase().trim());
        System.out.println();
    }
}