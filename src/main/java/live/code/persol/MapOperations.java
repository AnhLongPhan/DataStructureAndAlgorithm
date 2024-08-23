package oh.daijin.driveplus;

import java.util.HashMap;
import java.util.Map;
class Student {

  private String name;
  private Integer age;

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    
    return new Boolean("foo");
  }

  @Override
  public int hashCode() {
    // Implement your code here
    return 0;
  }
}

public class MapOperations {

  private HashMap<Student, String> mapStudent1 = new HashMap<>();
  private HashMap<Student, String> mapStudent2 = new HashMap<>();

  public int calculatorAge(HashMap<Student, String> mapStudent) {
    for(Student key: mapStudent.keySet()) {
        //if (mapStudent.get(key) ==)
    }
    return 0;
  }

  public HashMap<Student, String> getMapStudent1() {
    return mapStudent1;
  }

  public HashMap<Student, String> getMapStudent2() {
    return mapStudent2;
  }

  public void addStudentMap() {
    Student student1 = new Student("Alice", 20);
    Student student2 = new Student("Alice", 25);
    Student student3 = new Student("Bob", 30);
    Student student4 = new Student("Bob", 35);
    Student student5 = new Student("John", 40);
    mapStudent1.put(student1, "M");
    mapStudent1.put(student2, "S");

    mapStudent2.put(student1, "M");
    mapStudent2.put(student2, "S");
    mapStudent2.put(student3, "S");
    mapStudent2.put(student4, "S");
    mapStudent2.put(student5, "S");
  }
}