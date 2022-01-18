package wk01_Lab;
public class wk01_lab {
    public static void main(String[] args) {

        // Example 2 (A)
        System.out.println("Example 2 (A)");
        System.out.println("Hello, I am [Yi Lin]!");

        // Example 2 (B)
        System.out.println("Example 2 (B)");
        String moduleCode = "CSC1009";
        switch (moduleCode) {
            case "AUD":
                System.out.println("Australian dollar");
                break;
            case "MYR":
                System.out.println("Malaysian ringgit");
                break;
            case "IDR":
                System.out.println("Indonesian rupiah");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown Currency");
                break;
        }
        System.out.println("After switch");

        // Example 2 (C)
        System.out.println("Example 2 (C)");
        for (int i = 102; i >= 66; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
