public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        // Target 1
        System.out.println("Target 1 / Case 1: " + isPalindrome(-1221));
        System.out.println("Target 1 / Case 2: " + isPalindrome(707));
        System.out.println("Target 1 / Case 3: " + isPalindrome(11212));

        // Target 2
        System.out.println("Target 2 / Case 1: " + isPerfectNumber(6));
        System.out.println("Target 2 / Case 2: " + isPerfectNumber(28));
        System.out.println("Target 2 / Case 3: " + isPerfectNumber(5));
        System.out.println("Target 2 / Case 4: " + isPerfectNumber(-1));

        // Target 3
        System.out.println("Target 3 / Case 1: " + numberToWords(123));
        System.out.println("Target 3 / Case 2: " + numberToWords(1010));
        System.out.println("Target 3 / Case 3: " + numberToWords(-12));
    }

    public static boolean isPalindrome(int sayi) {
        sayi = Math.abs(sayi);
        String sayiString = Integer.toString(sayi);
        char[] charSayi = sayiString.toCharArray();

        int ilkIndex = 0;
        int sonIndex = charSayi.length - 1;
        while (ilkIndex < sonIndex) {
            if (charSayi[ilkIndex] != charSayi[sonIndex]) return false;

            ilkIndex++;
            sonIndex--;
        }

        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 5) {
            return false;
        }
        int total = 1;
        int highest = (int) Math.sqrt(num);
        highest++;
        for (int i = 2; i < highest; i++) {
            if (num % i == 0) {
                total += i;
                if (i != num / i) {
                    total += num / i;
                }
            }
        }
        return num == total;
    }

    public static String numberToWords(int num) {
        if (num<0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";

        for(char digit: digits) {
            switch(digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }

        return numToText.trim();
    }
}