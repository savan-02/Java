class Cons {

    Cons() {

    }

    public static void main(String[] args) {
        
        Cons c = new Cons();
        Abc a = new Abc("+asd");
        Abc b = new Abc();
        Xyz y = new Xyz();
    }

}

class Abc {

    Abc() {
        
    }

    Abc(String abc) {
        for (int i = 0; i < 10; i++) {
            
            System.out.println("ABC Call "+abc);
        }
    }

    Abc(String xyz,int a) {
        System.out.println("ABC Call "+xyz);
    }

}

class Xyz {

}