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
}
