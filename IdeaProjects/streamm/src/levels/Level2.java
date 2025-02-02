package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.getEmployees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
      // long n = teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).count();

        /* TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter (hint: mapToInt) */
       long a = teachers.stream().filter(teacher -> teacher.getSubject().equals(Subject.FLUTTER)).mapToInt(teacher -> teacher.getSalary()).sum();
       long t = teachers.stream().filter(teacher -> teacher.getSubject().equals(Subject.FLUTTER)).mapToInt(Teacher :: getSalary).sum();
        /* TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a */
      double r = teachers.stream().filter(teacher -> teacher.getName().startsWith("a")).mapToInt(Teacher :: getSalary).average().getAsDouble();
      teachers.stream().filter(teacher -> teacher.getName().startsWith("a")).mapToInt(Teacher::getSalary).average().ifPresent(System.out::println);
        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
 List<Teacher> teachers1 = teachers.stream().filter(teacher -> teacher.getName().startsWith("f")).collect(Collectors.toList());
List<Teacher> teachers2 = teachers.stream().filter(teacher -> teacher.getName().startsWith("a")).toList();
        /* TO DO 5: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non */
        boolean n = teachers.stream().anyMatch(teacher -> teacher.getSalary()>100000);

        /* TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes */
        /*First way*/
        Teacher t3 = teachers.stream().filter(teacher -> teacher.getSubject().equals(Subject.UNITY)).findFirst().orElse(new Teacher()) ;
        teachers.stream().filter(teacher -> teacher.getName().startsWith("g")).filter(teacher -> teacher.getSubject().equals(Subject.UNITY)).findFirst().ifPresent(System.out::println);
        /*Second way*/
         teachers.stream().filter(teacher -> teacher.getSubject().equals(Subject.UNITY)).limit(1).forEach(System.out::println);
        /* TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s */
      teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).limit(2).skip(1).forEach(System.out::println);
      teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).skip(1).findFirst().ifPresent(System.out::println);
      teachers.stream().filter(teacher -> teacher.getName().startsWith("s")).skip(1).limit(1).forEach(System.out::println);
    }

}
