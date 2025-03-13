package adm

class Teacher (val name:String)
{
    //метод для выставления оценки
    fun gradeStudent(student: Students,exam:Exam,score:Int)
    {
        student.setExam(exam,score)
    }
}