fun round(num: Int) : Int {
	
	var doubleValue : Double = num.toDouble() / 2
	var result : Int = 0
	
	if (doubleValue % 1 >= 0.5){
			result = (doubleValue + 1).toInt()
		} else {
			result = result.toInt()
		}
	return result
}


fun main(){
	print("Enter odd number: ")
	val value = readln().toInt()
	print(round(value))	
}
