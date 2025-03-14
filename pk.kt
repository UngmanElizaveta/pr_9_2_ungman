package ` payments`
//банковская карта
class Pk(var isBlocked:Boolean=false)
{
fun block()
{
    isBlocked=true
    println()
}
    fun unblock()
    {
        isBlocked=false
        println()
    }
}