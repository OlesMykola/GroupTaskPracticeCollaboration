package ihor.week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String original = "AAABBBCC7CD";
        System.out.println(removeDuplicates(original));

    }

    public static String removeDuplicates(String original) {
        String modified = "";
        for (int i = 0; i < original.length(); i++) {
            if (!modified.contains(String.valueOf(original.charAt(i)))) {
                modified += String.valueOf(original.charAt(i));
            }

        }
        return modified;
    }
}






