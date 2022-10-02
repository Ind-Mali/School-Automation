public class Student {
    Course lecture1;
    Course lecture2;
    Course lecture3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course lecture1, Course lecture2, Course lecture3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.lecture1 = lecture1;
        this.lecture2 = lecture2;
        this.lecture3 = lecture3;
        calcAvarege();
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.lecture1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.lecture2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.lecture3.note = note3;
        }
    }

    void addBulkVerbalNote(int verb_hist, int verbal_art, int verbal_math) {
        if (verb_hist >= 0 && verb_hist <= 100) {
            this.lecture1.verbalNote = verb_hist;
        }
        if (verbal_art >= 0 && verbal_art <= 100) {
            this.lecture2.verbalNote = verbal_art;
        }
        if (verbal_math >= 0 && verbal_math <= 100) {
            this.lecture3.verbalNote = verbal_math;
        }
    }

    void calcAvarege() {
        double leacture1Ave = this.lecture1.note * 0.75 + this.lecture1.verbalNote * 0.25;
        double leacture2Ave = this.lecture2.note * 0.75 + this.lecture2.verbalNote * 0.25;
        double leacture3Ave = this.lecture3.note * 0.75 + this.lecture3.verbalNote * 0.25;
        double totalAvarage = (leacture1Ave + leacture2Ave + leacture3Ave) / 3.0;
        this.avarage = Math.round(totalAvarage * 100) / 100d;
    }


    boolean isCheckPass() {
        calcAvarege();
        return this.avarage > 55;
    }


    void isPass() {
        System.out.println("====================");

        this.isPass = isCheckPass();
        printNote();
        System.out.println("Your avarage note\t:" + this.avarage);

        if (this.isPass) {
            System.out.println("You pass the class.");
        } else System.out.println("You do not pass the class");

//        this.avarage = (this.lecture1.note + this.lecture2.note + this.lecture3.note) / 3.0;
//        printNote();
//        if (this.avarage > 55) {
//            System.out.println("You pass the exam");
//            this.isPass = true;
//        } else {
//            System.out.println("You do not pass the exam");
//            this.isPass = false;
//        }
    }


    void printNote() {
        System.out.println("Student Name\t:" + this.name + "\nStudent no\t: "+ this.stuNo );
        System.out.println(this.lecture1.name + " Note\t\t:" + this.lecture1.note);
        System.out.println(this.lecture2.name + " Note\t\t:" + this.lecture2.note);
        System.out.println(this.lecture3.name + " Note\t\t:" + this.lecture3.note);
        //System.out.println("Your avarage note: " + this.avarage);
    }


}
