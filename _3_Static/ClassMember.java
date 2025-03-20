package Exercices.EX1._3_Static;
public class ClassMember
{
    private String name;
    private int myAmount;
    private static int classDiscBox = 0;
    public static final int INITIAL_AMOUNTS_OF_DISCS = 3;
    public ClassMember(String name)
    {
        this.name = name;
        this.myAmount = INITIAL_AMOUNTS_OF_DISCS;
        classDiscBox += INITIAL_AMOUNTS_OF_DISCS;
    }
    public String getName()
    {
        return this.name;
    }
    public int getStudentAmount()
    {
        return this.myAmount;
    }

    public static int getClassDiscBox()
    {
        return ClassMember.classDiscBox;
    }
    public void enterDiscs (int amount)
    {
        ClassMember.classDiscBox += amount;
        this.myAmount += amount;
    }

    public static void main(String[] args) {
        ClassMember[] members = new ClassMember[3];
        members[0] = new ClassMember("Moshe");  // 3
        members[1] = new ClassMember("Dvir");   // 6
        members[2] = new ClassMember("Michal"); // 9
        for (int i=0; i<members.length; i++)
        {
            members[i].enterDiscs(i);
        }
        System.out.println(members[2].getStudentAmount()); // 3+2=5
        System.out.println(members[2].getClassDiscBox());  // 9+1+2=12
    }
}
