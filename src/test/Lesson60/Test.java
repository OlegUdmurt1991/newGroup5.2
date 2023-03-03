package test.Lesson60;

public class Test {
    public static void main(String[] args) {
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        int max = searchMe.length() - substring.length();
        boolean foundIt = false;
        int n = substring.length();
        int j = 0;
        int k = 0;
        for (int i = 0; i <= max; i++) {
            test:
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            j = i;
            foundIt = true;
            
        }
        System.out.println(foundIt);
    }
}










//    public static void main(String[] args) {
//        int[][] arrayOfInts = {
//                { 32, 87, 3, 589 },
//                { 12, 1076, 2000, 12 },
//                { 622, 127, 12, 955 }
//        };
//        int searchfor = 12;
//
//        int i = 2, j = 0;
//        boolean foundIt = false;
//
//        SEARCH:
//        for (i = 0; i < arrayOfInts.length; i++) {
//            for (j = 0; j < arrayOfInts[i].length; j++) {
//                if (arrayOfInts[i][j] == searchfor) {
//                    foundIt = true;
//                    break SEARCH;
//                }
//            }
//        }
//        System.out.println(i + j);
//    }




   /* public static void main(String[] args) {
        int h = 1;
        int count = 0;
        long w = 5;
        while(h++ < 5) {
            do {
                if (w-- % 2 == 0)
                    continue;
                int t = 0;
                for (;;) {
                    t++;
                    if (t > 10)
                        break;
                    count++;
                }
            } while (w > 4);
            count++;
        }
        System.out.println(count);
    }*/




//    public static void main(String[] args) {
//        int w = 0, r = 1;
//        String name = "";
//        while(w < 2) {
//            name += "A";
//            do {
//                name += "B";
//                if (name.length() > 0)
//                    name += "C";
//                else
//                    break;
//            } while (r <= 1);
//            r++;
//            w++;
//            System.out.println(name);
//        }
//    }
