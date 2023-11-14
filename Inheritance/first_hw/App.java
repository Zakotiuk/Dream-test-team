package Inheritance.first_hw;

public class App {
    public static void main(String[] args) {
        Bird birds[] = new Bird []{
            new Penguin(),
            new Eagle(),
            new Chicken(),
            new Swallow()
        };

        for (int i = 0; i < 4; ++i){
            System.err.println("Bird with feathers " + birds[i].feathers 
                                            + ". This bird lay eggs " 
                                            + birds[i].layEggs 
                                            + " so that, bird say, that: " 
                                            + birds[i].fly());
        }
    }
}
