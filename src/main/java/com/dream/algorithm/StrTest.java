package suanfa;

// 反转字符串
public class StrTest {
    public static void main(String[] args) {
        StrTest strTest = new StrTest();
        strTest.solve("abcd");
    }

    public String solve (String str) {
        // write code here
        int length = str.length();
        char[] chs = str.toCharArray();
        char[] newChs = new char[length];
        int t = 0;
        for(int i=length-1;i>=0;i--) {
            newChs[t] = chs[i];
            t++;
        }
//        System.out.println(String.valueOf(newChs));
        return String.valueOf(newChs);
    }
}
