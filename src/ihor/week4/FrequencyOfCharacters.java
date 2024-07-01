package ihor.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println("frequency(\"AAABBCDD\") = " + frequency("AAABBCDD"));
    }

    public static String frequency(String characters) {
        String frequency = "";
        for (int i = 0; i < characters.length(); i++) {
            if (frequency.contains("" + characters.charAt(i))) {
                continue;
            }
            int count = 0;

            for (int j = i; j < characters.length(); j++) {
                if (characters.charAt(i) == characters.charAt(j)) {
                    count++;
                }
            }
            frequency += characters.charAt(i) + "" + count;

        }
        return frequency;
    }
}
