public class Calculator  {
    public int add(short a, short b) {
        // 주석 주석
        if(a + b > Integer.MAX_VALUE){
            return -1;
        }
        return a + b;
    }
}