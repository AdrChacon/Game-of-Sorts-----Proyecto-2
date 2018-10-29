
package Entes;

/**
 * @author Chacón Campos
 */
public class testMain {
    public static void main(String[] args){
        Infantry Fizz = new Infantry(1,null,1,5,5,20,32);
        Captain Fritz = new Captain(2,Fizz,1,10,10,40,55);
        Commander Fretz = new Commander(3,Fritz,1,10,10,60,94);
        System.out.println(Fizz.getHealth());
        System.out.println(Fritz.getHealth());
        System.out.println(Fretz.getHealth());
        Fritz.addSubordinate(Fizz.getName());
        Fritz.addSubordinate(Fretz.getName());
        System.out.println(Fritz.getSubordinates());
        System.out.println(Fritz.getName());
        System.out.println((172+(172*0.20)));
        System.out.println((172+(172*0.20))/5);
        System.out.println(172-1-((172+(172*0.20))/5));
    }
}
