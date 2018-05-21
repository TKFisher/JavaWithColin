package HeadFirstJava.Chapter_4;


public class TestingMethods
{
    int i = 1;
    String modelName;

    public static void main(String[] args){
        TestingMethods ts = new TestingMethods();
        ts.go();
        ts.go1();
        ts.go2();
        ts.go3(1);
        ts.go4(5,6);
        System.out.println(ts.go4(5,6));
        System.out.println(ts.go5(9,3));
        ts.modelName = "Ford";


    }
    public String setModelName (String n){

        return null;
    }

    public void go(){
        System.out.println("im inside go");
        go1();

    }
    public void go1(){
        System.out.println("im inside go1");

    }
    public void go2(){
        System.out.println("im inside go2");
    }
    public int go3(int b){
        int someName = 0;
        someName =+ b;
        System.out.println(someName);
        return someName;
    }
    public int go4 (int c, int d){
        int results = c + d;
        //System.out.println(results);

        return results;
    }
    public double go5(double x, double y){
        double z = x / y;
        return z;
    }

}
