import java.lang.reflect.Array;
import java.util.ArrayList;

public class removeVowel {
    public static String disemvowel(String str){
        int length = str.length();
        ArrayList<Integer> vIndex = new ArrayList<>();
        for(int i =0;i<str.length();i++){
            char thisChar = str.charAt(i);
            if(thisChar=='A'||thisChar=='E'||thisChar=='I'||thisChar=='O'||thisChar=='U'||thisChar=='Y'||thisChar=='e'||thisChar=='a'||thisChar=='i'||thisChar=='o'||thisChar=='u'||thisChar=='y'){
                vIndex.add(vIndex.size(),i);}}
        ArrayList<Character> newList = new ArrayList<>();
        for(int i=0;i<length;i++){
            if(!vIndex.contains(i)){
                newList.add(str.charAt(i));
            }
        }
        char[] charArray = new char[newList.size()];
        for(int i=0;i<newList.size();i++){
            charArray[i] = newList.get(i);
        }
        String newString = String.valueOf(charArray);
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("Hello My Name Is Jimmy"));
    }
}
