

fun main () {
   println(toCamelCase("the-stealth-warrior"))
}


fun toCamelCase(str:String):String {
    var camelCaseString = ""
    var isUnderScore = false
    for (char in str) {
        if (char == '_' || char == '-') {
            isUnderScore = true
        } else if (isUnderScore) {
            camelCaseString += char.uppercaseChar()
            isUnderScore = false
        } else {
            camelCaseString += char
        }
    }
    return camelCaseString
}