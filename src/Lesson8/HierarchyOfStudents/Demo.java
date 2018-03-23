package Lesson8.HierarchyOfStudents;

public class Demo {
    public Student createHighestParent() {
        Course[] courses = new Course[5];
        Student student = new Student("Ihor", "Zhluktenko", 683, courses);
        return student;
    }

    public SpecialStudent createLowestChild() {
        Course[] courses2 = new Course[3];
        SpecialStudent specialStudent = new SpecialStudent("Oleg", "Slusar", 562, courses2, 547, "slusar@i.ua");
        return specialStudent;
    }
}
