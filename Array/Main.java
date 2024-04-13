package Array;
class ArrayExample{  // array example class
    void demoArrays(){  // array example class me demo array method
        int ages[] = new int[3];
        float[] weight = new float[3];
        String[] names = {"Sid","Ankit","Saxena"};
        ages[0] = 34;
        ages[1] = 5;
        ages[2] = 45;
        // ages[6] = 44;  // index out of bound
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        weight[0] = 54;
        weight[1] = 62;
        weight[2] = 55;
    }

}
public class Main {  // main Class
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArrays();
    }
}
