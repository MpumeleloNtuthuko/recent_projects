import java.util.Objects;

/**
 * Class contains the "jumbledString() function"
 * @author - Mpumelelo Dlamini
 */
public class StringJumble {

        /**
         * Jumbles a given string based on the specified number of times.
         *
         * @param s - The input string to be jumbled.
         * @param n - The number of times to jumble the string.
         * @return The jumbled string after performing the specified number of jumbling operations.
         */
        public static String jumbledString(String s, long n) {

//          Check if the given arguments are valid
            if (Objects.equals(s, "") || n < 0) {
                return "Oops! Looks like there is an error in your inputs.";
            }

//          Convert given string into an array of characters
            char[] arrayOfCharacters = s.toCharArray();

            String newString = "";

//          Loop n times
            for (int i = 0; i < n; i++) {
                StringBuilder evenIndex = new StringBuilder(); // StingBuilder for even indexed characters
                StringBuilder oddIndex = new StringBuilder();  // StingBuilder for odd indexed characters

//              Doing the actual jumbling of the string
                for (int h = 0; h < arrayOfCharacters.length ; h++) {
                    if (h % 2 == 0) {
                        evenIndex.append(arrayOfCharacters[h]);
                    } else {
                        oddIndex.append(arrayOfCharacters[h]);
                    }
                }

                newString = evenIndex.toString() + oddIndex.toString(); // New jumbled string
                arrayOfCharacters = newString.toCharArray();
            }

            return newString;
        }
}
