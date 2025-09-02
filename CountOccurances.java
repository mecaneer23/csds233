public class CountOccurances {
    int getOccurancesIteratively(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    int getOccurancesRecursively(String str, char ch) {
        if (str.length() == 0) {
            return 0;
        }
        return (str.charAt(0) == ch ? 1 : 0) + getOccurancesRecursively(str.substring(1), ch);

    }

    public static void main(String[] args) {
        CountOccurances countOccurances = new CountOccurances();
        String str = "Occurrences";
        char ch = 'c';
        System.out.println("Iteratively: " + countOccurances.getOccurancesIteratively(str, ch));
        System.out.println("Recursively: " + countOccurances.getOccurancesRecursively(str, ch));
    }
}
