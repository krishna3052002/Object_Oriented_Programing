public class StudentInfo {
    public int roll;
    public int  id;
    public String name;
    public boolean pass;
    public StudentInfo(){
        roll=12;
        id=202104012;
        name="Krishna";
        pass=true;
    }

    public StudentInfo(int roll,int id,String name,boolean pass)
    {
        this.roll=roll;
        this.id=id;
        this.name=name;
        this.pass=pass;
    }

    public int getRoll()
    {
        return roll;
    }


    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public boolean isPass() {
        return pass;
    }

    public int getId()
    {
        return id;
    }

    public static void main(String[] args)
    {
        StudentInfo student1= new StudentInfo();
        StudentInfo student2= new StudentInfo(11,202104011,"Pronoy", true);
        StudentInfo student3= new StudentInfo(2,202104013,"Shamim", true);
        student1.setRoll(1);
        student2.setRoll(2);
        System.out.println("Student Information and Result of 3rd Semester"+"\n--------------------------------------------");
        System.out.println("Name : "+student1.getName()+"\nRoll : "+student1.getRoll()+"\nId   : "+student1.getId()+"\nPass : "+student1.isPass());
        System.out.println("--------------------------------------");
        System.out.println("Name : "+student2.getName()+"\nRoll : "+student2.getRoll()+"\nId   : "+student2.getId()+"\nPass : "+student2.isPass());
        System.out.println("--------------------------------------");
        System.out.println("Name : "+student3.getName()+"\nRoll : "+student3.getRoll()+"\nId   : "+student3.getId()+"\nPass : "+student3.isPass());
    }
}
