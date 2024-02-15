public class Student {

    //instance variables
    private String name;
    private int id;
    private int age;


    //constructor
    public Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //accessors begin here
    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public int getAge(){
        return age;
    }
    //accessors end here

    //mutators start here
    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setID(int newID){
        id = newID;
    }
    //mutators end here
}