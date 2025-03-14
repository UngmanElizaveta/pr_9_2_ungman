package ` payments`
//клиент
open class Client(val name:String, val account: Client, val card:Pk)
{

    open fun makePayment(amount:Double)
    {
        if (card.isBlocked)
            println("ошибка, карта заблокирована")
        if(amount>account.getBalance())
        {
            println("недрстаточно стредств")
        }
        else {
            account.balance-=amount
            println()
        }
    }
    open fun transer(otherClient:Check, amount:Double)
    {
        if(card.isBlocked)
        {
            println("ошибка")
        }
        if(amount>account.getBalance())
        {
            println("ошибка")
        }
        else{
            account.balance-=amount
            otherClient.deposit((amount))
            println()
    }
    }
    fun blokcard()
    {
        card.block()
    }
}