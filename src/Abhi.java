class Abhi {

    int age;

    Abhi() {
        System.out.println("My name is Abhinav");
    }

    public int details(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Abhi obj = new Abhi();

        obj.age = 21;

        System.out.println(obj.details(10,20));
    }
}