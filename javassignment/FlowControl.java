public class FlowControl {
    public static void main(String[] args) {
        int x = 10;

        if(x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is 5 or less");
        }

        switch(x) {
            case 5: System.out.println("Five"); break;
            case 10: System.out.println("Ten"); break;
            default: System.out.println("Other");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("For loop iteration: " + i);
        }
    }
}