public class Animal {
    int ears =18 ;
    public Animal(){
       System.out.println("Animal is born");

    }
    public Animal(int ears){
        this.ears = ears;
    }
    //private  int ears;
    public void randomfun(){
        System.out.println(5);
    }
    public String hello(){
        return "hello Animal";
    }
    public void setEars(int e){
        ears =e;
    }
    public int getEars(){
        return ears;
    }
}
