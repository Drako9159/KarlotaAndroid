package com.drakodev.karlota

fun main() {
    //print("Hello")
    // val = const
    // var = variable
    val age: Int = 12
    val example: Long = 23
    val flotante: Float = 12f //add 6 decimals
    val dedouble: Double = 123.2 //add 6+ decimals
    val charExample: Char = '2'
    val stringExample: String = "hellito"
    val boolexample: Boolean = false
    val sumarys: Number = 2 + 2
    val nameNullable:String? = null
    // println("Tengo $age años")
    // prueba()
    switchWhen(3)

}

fun example(extreme: Number) {
    val result: Number = 3 + 2
    val sumar: Int = extreme.toInt() + 2
    println("Values $result tambien hay $extreme sumandole 2 es $sumar")
}

fun prueba() {
    example(123)
    println("prueba de piloto")
}

fun switchWhen(month: Int) {
    when (month) {
        1, 2, 3 -> print("Prime trimesetre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        in 10..20 -> print("Mas del tercer trimestre")
        !in 10..20 -> print("No es entre 10 y 20")
        else -> print("Trimestre invalido")
    }
}

fun whenCheckAny(value: Any): Any {
    val result = when (value) {
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if (value) print("true") else print("nada por aqui")
        else -> "nada"
    }
    return result;
}

fun arrayExample(){
    val week = arrayOf("lunes", "martes", "miercole", "jueves", "viernes")
    week.size
    for(position in week.indices){
        println("day $position")
    }
    for((position, value) in week.withIndex()){
        println("la posicion $position contiene el valor de $value")
    }
}

fun listExample(){
    val readOnly:List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes")
    print(readOnly.last())
    println(readOnly.first())
    val example = readOnly.filter { it.contains("es") }
    readOnly.forEach { weekDay -> weekDay.length }

    val mutableList:MutableList<String> = mutableListOf("lunes", "martes", "miercoles", "juves", "viernes")
    mutableList.add("sabado")
    mutableList.add(0, "domingo")
    mutableList.isEmpty()

}