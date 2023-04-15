fun round(num: Int) : List<Int> {
	
	var doubleValue : Double = num.toDouble() / 2
	var firstNum : Int
	var result = mutableListOf<Int>()
	
	if (doubleValue % 1 >= 0.5){
			firstNum = (doubleValue + 1).toInt()
			result.add(firstNum)
			result.add(num - firstNum)
		}
	return result
}


fun main(){
	print("Enter odd number: ")
	val value = readln().toInt()
	print(round(value))	
}
