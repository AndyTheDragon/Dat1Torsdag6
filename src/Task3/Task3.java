package Task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> passed = new ArrayList<>();
        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Introduktion til Java");
        canTeach.add("Videregående Java");
        canTeach.add("Avanceret Java");
        canTeach.add("Introduktion studieliv");
        passed.add("Introduktion studieliv");
        passed.add("Torsdagsbar");

        persons.add( new Student("Franck", passed) );
        persons.add( new Student("Rolf", passed) );
        passed = new ArrayList<>(passed);
        passed.add("Introduktion til programmering");
        passed.add("Java 1.0");
        persons.add( new Student("André", passed) );

        persons.add( new Teacher("Tess", canTeach) );
        canTeach = new ArrayList<>(canTeach);
        canTeach.add("Java 1.0");
        persons.add( new Teacher("Signe", canTeach) );

        for (Person p : persons) {
            //System.out.println(p);
            if(!p.addCourse("Java 1.0")) {
                System.out.print(p.getName());
                if (p instanceof Student) {
                    System.out.println(" har allerede bestået dette kursus.");
                }
                else if (p instanceof Teacher) {
                    System.out.println(" kan ikke undervise i dette fag.");
                }
            }
            //System.out.println(p);
        }


    }
}
