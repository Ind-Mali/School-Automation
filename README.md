# School Automation

- This automation consist of Student, Teacher, Course classess.

## Course class
This class include addTeacher() and printTeacher() 
method.

### addTeacher()
- If the teacher branch and prefix are equal, then this method matches inside the **teacher** with the **teacher**'s name.

### printTeacher()
-This method call the teacher attribute  at the console.


## Student classess

This class include **addBulkExamNote()**, **addBulkVerbalNote()**, **calcAvarage()**, **isCheckPass()**, **isPass()**, **printNote()**.


### addBulkExamNote() and addBulkVerbalNote()
- This method, firstly checked the grade between 0 and 100. If the note is not at this interval, it will not give permission to write the new note.
- If the above condition is met, given note match the inside note.

### calcAvarage()

- This method calculate verbal note and exam note according to constraints.
- After that throw back avarage note.

### isCheckPass()
- This method return boolean.
- if average above the 55 return true.

### isPass()
- This method control student  pass or not according to average.

### printNote()
- This return all the note and if it is necessary return student  name and student number.


## Teacher classess
- When we want to create a new teacher we can use this class

### print()
- This class include only print() method and this method return teacher's attributes.