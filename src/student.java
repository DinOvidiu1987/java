public class student extends Person {
      private String classGroup;
    public student(String name, int age, int height, int stamina, String classGroup) {
        super(name, age, height, stamina);
        this.classGroup = classGroup;
    }

    public String getClassGroup() {
        return classGroup;
    }

    @Override
    public String toString() {
        return "student{" +
                "classGroup='" + classGroup + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", stamina=" + stamina +
                '}';
    }

    public void  grow(int size) {

     super. grow(size);
     super. grow(size);
    }
}

