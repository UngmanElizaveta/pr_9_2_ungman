package ` payments`
//администратор
class administrator(name:String,account:Client,card:Pk):Client(name,account,card)
{
fun blockCarde(amount:Double)
{
    if(amount>account.getBalance())
    {
        blokcard()
        println("администратор заблокировал карту")
    }
    else {
        println("карта не блокируется")
    }
}
}