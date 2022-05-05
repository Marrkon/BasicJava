package genericAndInterfaces;

public class InterfaceImplenets {
    InterfaceImplenets(){
        System.out.println("Interfaceimplements constructor");
    }
    protected void meth1(){
        System.out.println("InterfaceImplenets");
    }
}

class Cd extends InterfaceImplenets {

        Cd(){
            super();
        }

        public void meth1 (int i) {
            System.out.println("Cd");
        }
        public static void main(String args[]) {
            Cd cd = new Cd();
            cd.meth1();
        }
}

