// after compiling this file i got 5 .class files
public class ClassFileCheck {
    public static void main(String[] args) {
        System.out.println("Main Class");

        ClassTwo classTwo = new ClassTwo();
        classTwo.printClassTwo();

        ClassThree classThree = new ClassThree();
        classThree.printClassThree();

        PrivateClass p = new PrivateClass();
        p.privateClass();
    }

    private static class PrivateClass {
        private void privateClass() {
            System.out.println("From PrivateClass");
        }
    }
}


class ClassTwo {
    void printClassTwo() {
        System.out.println("From Class Two");
    }
}

class ClassThree {
    protected void printClassThree() {
        System.out.println("From Class Three");
    }
}

class ClassFour {
    private void printClassFour() {
        System.out.println("From Class Four");
    }
}
