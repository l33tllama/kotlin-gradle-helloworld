package test

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")
    words.add("again..")
    words.add("Yay auto build FTW!!!!")

    return words.joinToString(separator = " ")
}

fun max(a : Int, b: Int) = if (a > b) a else b

fun parseInt(str : String?) : Int? {
	try {
		return Integer.parseInt(str)
	} catch (e: NumberFormatException){
		println("One of the arguments isn't an Int")
	}
	return null
}

fun main(args: Array<String>) {

    println(getGreeting())
    println(max(1520, 501))
    val inputA:Int? = parseInt(readLine())
    val inputB:Int? = parseInt(readLine())
    if(inputA != null && inputB != null){
    	println("$inputA * $inputB = ${inputA * inputB}")
    
    }

}