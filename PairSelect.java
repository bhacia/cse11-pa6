import tester.*;

class Pair {
    int a;
    int b;
    Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class PairSelect {
    static int[] getAs(Pair[] pairArr) {
        int length = 0;
        int pairIndex = 0;
        for(Pair num : pairArr) {
            if(num.a == pairArr[pairIndex].a) {
                length += 1;
            }
            pairIndex += 1;
        }
        int[] newArr = new int[length];
        int index = 0;
        for(Pair num : pairArr) {
            if(num.a == pairArr[index].a) {
                newArr[index] = num.a;
            }
            index += 1;
        }
        return newArr;
    }
    void testGetAs(Tester t) {
        Pair[] pairArr1 = {new Pair(1, 2), new Pair(3, 4), new Pair(5, 6)};
        int[] result1 = {1, 3, 5};
        t.checkExpect(getAs(pairArr1), result1);

        Pair[] pairArr2 = {new Pair(3, 8), new Pair(9, 2), new Pair(-21, 78)};
        int[] result2 = {3, 9, -21};
        t.checkExpect(getAs(pairArr2), result2);

        Pair[] pairArr3 = {new Pair(-25, 11), new Pair(56, 31), new Pair(62, 101)};
        int[] result3 = {-25, 56, 62};
        t.checkExpect(getAs(pairArr3), result3);

        Pair[] pairArr4 = {new Pair(-4, -19), new Pair(43, -28), new Pair(-88, -63)};
        int[] result4 = {-4, 43, -88};
        t.checkExpect(getAs(pairArr4), result4);
    }
}