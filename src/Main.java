public class Main {
    public static void main(String[] args) {
        MyStringBuilder s = new MyStringBuilder("Mama myla ramy");
        System.out.println("0 " + s);
        s.undo();
        System.out.println("1 " + s);
        s.append("Ivan");
        System.out.println("2 " + s);
        s.append(" Lera");
        System.out.println("3 " + s);
        s.append(123);
        System.out.println("4 " + s);
        s.undo();
        System.out.println("5 " + s);
        s.undo();
        System.out.println("6 " + s);
        s.undo();
        System.out.println("7 " + s);
        s.undo();
        System.out.println("8 " + s);
    }
}