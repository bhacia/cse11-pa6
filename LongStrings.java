import tester.*;

class LongStrings {
    static String[] longStrings(String[] strArr, int n) {
        int length = 0;
        for(String s : strArr) {
            if(s.length() >= n) {
                length += 1;
            }
        }
        String[] newArr = new String[length];
        int index = 0;
        for(String s : strArr) {
            if(s.length() >= n) {
                newArr[index] = s;
                index += 1;
            }
        }
        return newArr;
    }
    void testLongStrings(Tester t) {
        String[] strArr1 = {"happy", "birthday", "to", "you"};
        String[] result1 = {"happy", "birthday"};
        t.checkExpect(longStrings(strArr1, 5), result1);

        String[] strArr2 = {"do", "not", "worry", "be", "happy"};
        String[] result2 = {"not", "worry", "happy"};
        t.checkExpect(longStrings(strArr2, 3), result2);

        String[] strArr3 = {"i", "still", "have", "faith", "in", "you"};
        String[] result3 = {};
        t.checkExpect(longStrings(strArr3, 7), result3);

        String[] strArr4 = {"with", "joy", "and", "our", "sorrow"};
        String[] result4 = {"with", "sorrow"};
        t.checkExpect(longStrings(strArr4, 4), result4);
    }
}
