public class Person {

    private int x;
    private int y;
    private int speed;
    private String name;
    private boolean canTalk;
    //private GreenfootSound sound;
    
    public Person(){
    x = 0;
    y = 0;
    speed = 1;
    name = "Example";
    canTalk = true;
    }
    
    public Person(int pX){
    x = pX;
    y = 0;
    speed = 1;
    name = "Example";
    canTalk = true;
    }
    
    public Person(int pX, int pY){
    x = pX;
    y = pY;
    speed = 1;
    name = "Example";
    canTalk = true;
    }
    public String toString(){
        String res = "Person Name: " + name + "\n Position (x,y): (" + x + "," + y + ") \n Speed:" + speed;
        return res;
    }
    public void walk(){
        x += 1;
        y += 1;
    }
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person(2);
        Person p3 = new Person(3,4);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}