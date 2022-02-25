package edu.mum.cs.cs525.patterns.factory._01_iteration;

abstract public class Pizza {

    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void prepare(){
        System.out.println("Preparing " + name + " pizza");
    };

    void bake() {
        System.out.println("Baking " + name + " pizza");
    };
    void cut() {
        System.out.println("Cutting " + name + " pizza");
    };
    void box() {
        System.out.println("Boxing " + name + " pizza");
    };
}
