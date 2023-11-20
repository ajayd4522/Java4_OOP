package objectOrientedProgramming.oop4.staticExamples;

 

public  class InnerClasses {

    static class Test {  // now this does not need an instance of outer class bcoz it is static
         String name;

        public Test (String name){
            this.name = name;
        }

        @Override   // this is called annotations
        public String toString (){ // our own toString method
            return name;
        }
    }

    public static void main(String[] args) { 
        Test a = new Test("Ajay"); // you can create an object of static class inside the outer class, but it will not work if you create an object of outer class and try to use inner class properties.
        
        Test b = new Test("Aarve");

        System.out.println(b);

        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}
