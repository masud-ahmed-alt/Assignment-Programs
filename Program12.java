public class Program12 {

    public static void main(String[] args) {
        Variables variables = new Variables();
        Variables variables1 = new Variables(20);
        Variables variables2 = new Variables(50, 80);
        Variables variables3 = new Variables(60, 90, 100);
        variables.getAverage();
        variables1.getAverage();
        variables2.getAverage();
        variables3.getAverage();
    }
}

class Variables {
    int var1, var2, var3;
    double avg;

    Variables() {
        var1 = 10;
        var1 = 20;
        var2 = 30;
    }

    Variables(int x) {
        var1 = x;
        var2 = 40;
        var3 = 50;
    }

    Variables(int x, int y) {
        var1 = x;
        var2 = y;
        var3 = 60;
    }

    Variables(int x, int y, int z) {
        var1 = x;
        var2 = y;
        var3 = z;
    }

    void getAverage() {
        avg = (double) (var1 + var2 + var3) / 3;
        System.out.println("Average : " + avg);
    }
}
