fun main(args: Array<String>) {

    print("Enter your name:")
    var name = readLine()

    print("Enter your age:")
    var age:Int = readLine()!!.toInt()

    print("Enter your Deapt:")
    var dept = readLine()

    println("Name: "+name)
    println("Age:" + age)
    println("Dept :"+dept)

}