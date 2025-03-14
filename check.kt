package ` payments`
//счет
class Check(var balance: Double)
{
    fun deposit(amount:Double)
    {
        if(amount>0)
            balance+=amount
        println("счет пополнен на $amount")
        else
           println("")
    }


    fun getBalance():Double
    {
        return balance

    }
}