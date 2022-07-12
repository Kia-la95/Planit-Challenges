public class Max_occurrence {

    public static Character getMaxOccurringChar( String str){

        String new_str = str.toLowerCase(); //to avoid missing Uppercase letters
        new_str = new_str.replaceAll("\\s",""); //remove all the space in the string

        System.out.println(new_str);
        int charCount = 0;
        char max_OC = ' ';
        for (int i = 0; i < new_str.length(); i++){
            int count = 0;
            for (int j = 0; j < new_str.length(); j++){
                if (new_str.charAt(i) == new_str.charAt(j)) {
                    count++;
                }
            }
            if (charCount < count) {
                charCount = count;
                max_OC = new_str.charAt(i);
            }
        }

        return max_OC;


    }

    public static void main(String[] args) throws Exception {
        String str = "Character";
        System.out.println("The given string is: " + str);
        System.out.println("Max occurring character in the given string is: " + getMaxOccurringChar(str));
    }
}
