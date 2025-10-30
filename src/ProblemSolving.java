import java.util.Set;

public class ProblemSolving {

  /**
   * Returns whether every word in the set starts with the letter A (either
   * upper or lower case).
   * 
   * Edge case: If set is empty, return true.
   * 
   * @param words a set of words
   * @return true if every word starts with A (case-insensitive), false otherwise.
   */
  public static boolean allStartWithA(Set<String> words) {
    // Edge case
    if (words.isEmpty()) {
      return true;
    }
    
    // Go through every word in the set
    for (String word : words) {
      // Check if the first index is not a
      if (word.toLowerCase().charAt(0) != 'a') {
        // Exit and return false
        return false;
      }
    }

    // Return true because every word starts with a
    return true;
  }

  /**
   * Returns whether there exists at least one empty string in the set of words.
   * 
   * Edge case: If set is empty, return false.
   * 
   * @param words a set of words
   * @return true if there is at least one empty string, false otherwise
   */
  public static boolean hasEmptyString(Set<String> words) {
    for (String n : words) {
      if(n.isEmpty()){
        return true;
      }
    }
    return false;
  }

  /**
   * Returns the length of the longest word in the set.
   * 
   * Edge case: If the set is empty, return 0
   * 
   * @param words a set of words
   * @return the maximum length of a word in the set
   */
  public static int maxLength(Set<String> words) {
    // Check for edge case
    if (words.isEmpty()) {
      return 0;
    }

    // Variable to trace max length
    int maxLength = 0;

    // Iterate through the words set
    for (String word : words) {
      // Check if the length of the word is greater than max
      if (word.length() > maxLength) {
        maxLength = word.length();
      }
    }

    // Return the max length
    return maxLength;
  }

 /**
   * Returns the length of the shortest word in the set.
   * 
   * Edge case: if set is empty, return Integer.MAX_VALUE
   * 
   * @param words a set of words
   * @return the minimum length of a word in the set
   */
  public static int minLength(Set<String> words) {
    if(words.isEmpty()){ 
      return Integer.MAX_VALUE;
    }
    int minLength = Integer.MAX_VALUE;
    for (String n : words) {
      if( n.length() < minLength){
        minLength = n.length();
      }
    }
    return minLength;
  }
}