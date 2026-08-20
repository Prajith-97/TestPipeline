package javaPrograms.nestedClasses;

abstract  class OuterClass_anonymous {
    public void printMessage(){
        System.out.println("Hii, How are you");
    }

    public static void main(String[] args){
        OuterClass_anonymous outer = new OuterClass_anonymous(){
            @Override
            public void printMessage() {
                super.printMessage();
                System.out.println("I'm fine, thank you!");
            }
        };
        outer.printMessage();
    }
}
