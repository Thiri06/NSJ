public class Main {

    // method1 : without return type without paremeter and arguements
    static void method1(){
        System.out.println("Hello, this is method 1.");
    }

    // method2 : without return type with parameter and arguements
    static void method2(String name){
        System.out.println("Hello, " + name);
    }

    // method3 : with return type without parameter and arguments
    /*  in this method 3, to not use parameter and arguments but pass the data,
     we have to use a variable to store the data 
     and return the variable with data*/
    static int method3(){
        int age = 19;
        return age;

    }

    // method4 : with return type with parameter and arguments
    static int method4(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        method1();
        method2("Eaint Thiri Mon and this is method 2");
        System.out.println("My age is " + method3());
        System.out.println(method4(10,20));
    }

    
    
}
