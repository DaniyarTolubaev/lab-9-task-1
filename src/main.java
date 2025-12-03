public class main {
    public static void main(String[] args) {

        ExceptionGenerator eg = new ExceptionGenerator();

        try {
            eg.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("An error has occurred: you are accessing an object that is null!");
            System.out.println("----- toString() -----");
            System.out.println(e.toString());
            System.out.println("----- printStackTrace() -----");
            e.printStackTrace();
        }
    }

}
