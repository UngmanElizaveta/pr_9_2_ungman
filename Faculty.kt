package adm
class Faculty(val name:String)
{
    private var student:Students? =null

    //метод для добавления студента
    fun AddStudent(student:Students)
    {
        when{
            student==null -> this.student=student
            else -> println("студент уже зарегистирирован")
        }
    }

}