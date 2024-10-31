package ex2;

import vn.edu.tdtu.ArrayHandler;
import vn.edu.tdtu.ArrayOutput;

public class Exercise2 {
    public static void main(String[] args) {
        int a[] = {12, 2, 24, 5, 6};
        int b[] = {7, 3, 11, 23};
        ArrayOutput.print(a);
        ArrayOutput.print(b);
        int c[] = ArrayHandler.merge(a, b);
        ArrayOutput.print(c);
        ArrayHandler.sort(c);
        ArrayOutput.print(c);
        ArrayOutput.write(c, "output.txt");
    }
}
