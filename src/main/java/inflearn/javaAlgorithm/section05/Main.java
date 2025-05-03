package inflearn.javaAlgorithm.section05;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<PhoneNumber, String> map = new HashMap<>();
        PhoneNumber p1 = new PhoneNumber(111, 222, 333);
        PhoneNumber p2 = new PhoneNumber(111, 222, 333);
        map.put(p1, "제니");
        map.put(p2, "톰");

    }

    public static class PhoneNumber {
        int areaCode;
        int prefix;
        int lineNum;

        public PhoneNumber(int areaCode, int prefix, int lineNum) {
            this.areaCode = areaCode;
            this.prefix = prefix;
            this.lineNum = lineNum;
        }
    }

}
