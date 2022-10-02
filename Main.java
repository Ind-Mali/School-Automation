public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "Hist", "0905368564595");
        Teacher t2 = new Teacher("Gamze Hoca", "Art", "095467898");
        Teacher t3 = new Teacher("Kamil Hoca", "Math", "54655");


        Course history = new Course("History", "101", "Hist");
        history.addTeacher(t1);

        Course art = new Course("Art", "102", "Art");
        art.addTeacher(t2);

        Course math = new Course("Math", "103", "Math");
        math.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", history, art, math);
        s1.addBulkExamNote(100, 78, 50);
        s1.addBulkVerbalNote(95,85,78);
        s1.isPass();

        Student s2 = new Student("Kamil", "432", "54", history, art, math);
        s2.addBulkExamNote(67, 34, 98);
        s2.addBulkVerbalNote(85,65,90);
        s2.isPass();

    }
}
