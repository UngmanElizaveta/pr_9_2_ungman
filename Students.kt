package adm

open class Students (val name:String, val faculty:Faculty)
{
    private var mathResult: ExamResult?=null //результат по математике
    private var physicResult: ExamResult?=null //результат по физике
    //метод регистрации на экзамен
    open fun registExam(exam:Exam)
    {
        when (exam.subject)
        {
            "Математика"->if( mathResult==null){ mathResult=examResult(exam,null)}
            else {println("Уже зарегистирирован на экзамене по математике")}
            "Физика"->if( physicResult==null){physicResult=examResult(exam,null)}
            else {println("Уже зарегистирирован на экзамене по физике")}
            else->{println("неизвестный предмет")}
        }
    }
    //метод для выставления оценки
    open fun setExam(exam:Exam,score:Int)
    {
        when(exam.subject)
        {
            "Математика"->mathResult?.score=score
            "Физика"->physicResult?.score=score
            else->{println("неизвестный предмет")}
        }
    }
    //метод для вычисления среднего балла
    fun getScore():Double
    {
        var totalScore=0
        var count =0
        if(mathResult?.score !=null)
        {
            totalScore +=mathResult.score
            count++
        }
        if(physicResult?.score !=null)
        {
            totalScore +=physicResult.score
            count++
        }
        return totalScore.toDouble()
    }
}