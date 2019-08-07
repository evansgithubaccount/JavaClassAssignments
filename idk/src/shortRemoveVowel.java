public class shortRemoveVowel {
    public static String disemvowel(String str){return str.replaceAll("(?i)[aeiouy]","");}
    public static void main(String[] args){System.out.println(disemvowel("Hello My Name Is Jimmy Dang"));}
}