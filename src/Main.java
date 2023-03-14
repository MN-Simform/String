public class Main {
    public static void main(String[] args) {
        System.out.println("String Variables Initialization :");
        String str1 = "  String Using Literal  ";
        String str2 = new String("  String Using New Keyword  ");
        StringBuilder sBuilder = new StringBuilder("  String Builder ");
        StringBuffer sBuffer = new StringBuffer("  String Buffer ");

//        Printing Strings Values in Console
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(sBuilder);
        System.out.println(sBuffer);
        System.out.println();

//        Append Lines in StringBuilder
        sBuilder.append("Line 1 ");
        sBuilder.append("Line 2 ");
        sBuilder.append("Line 3 ");
        sBuilder.append("Line 4 ");
        sBuilder.append("Line 5 ");
        System.out.println("Appended String Builder : " + sBuilder);

//        Append Lines in StringBuffer
        sBuffer.append("Line 1 ");
        sBuffer.append("Line 2 ");
        sBuffer.append("Line 3 ");
        sBuffer.append("Line 4 ");
        sBuffer.append("Line 5 ");
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