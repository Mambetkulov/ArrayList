import java.util.ArrayList;

public class Student {
    String name ;
    int age;
    String group;
    ArrayList<Student> java = new ArrayList<>();
    ArrayList<Student> js = new ArrayList<>();
    ArrayList<Student> byAge = new ArrayList<>();
    ArrayList<Student> byName = new ArrayList<>();


    public Student(){

    }


    public Student(String name, int age , String group){
        this.name = name;
        this.age = age;
        this.group = group;

    }



public  void java (ArrayList<Student> students){
   for(Student i : students){
       if(i.group.trim().equals("Java 16")){
           java.add(i);
       }else{
           js.add(i);
       }
   }

    System.out.println(java);

}

public void js (){
    System.out.println(js);
}


public ArrayList<Student> age (ArrayList<Student> students){
    for(Student i : students){
        if(i.age >= 19 && i.age <= 23){
           byAge.add(i) ;
        }
    }
    return byAge;
}

public ArrayList<Student> name (ArrayList<Student> students){
    for(Student i : students){
        String n = i.name.trim();
        String a = n.substring(0,1);
       if(a.equalsIgnoreCase("A")){
           byName.add(i);
       }
    }

    return byName;
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}' + "\n";
    }
}
