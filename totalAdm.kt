import adm.Student2
import adm.Faculty
import adm.Teacher
import adm.Exam
 fun main()
 {
     //создание факультета
     val faculty=Faculty("Программирование")
     //созхдание абитуриента
     val student=Student2("Иван",faculty)
     faculty.AddStudent(student)


     //создание экзаменов
     val mathExam=Exam("Математика")
     val physicExam=Exam("Физика")

     //регистрация абитуриента на экзамен
     student.registexam(mathExam)
     student.registexam(physicExam)

     //создание преподавателя
     val teacher=Teacher("Петров")

     //Преподаватель выставляет оценки
     teacher.gradeStudent(student,mathExam,90)
     teacher.gradeStudent(student,physicExam,85)

         //средний балл
     val score=student.getScore()
     println("Средний балл ${student.name}: $score")


 }
