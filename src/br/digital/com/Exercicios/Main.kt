package br.digital.com.Exercicios

fun main() {
    println("Questão 1: " + max3(3, 1, 2))
    println("Questão 2: " + diferente("oi", "oi"))
    println("Questão 3: " + par(4))
    print("Questão 4: ")
    print100Impar()
    println()
    println("Questão 5: " + quatroNums(5, 3, 4, 2))
    print("Questão 6: ")
    print100Pos()
}

fun max3(num1: Int, num2: Int, num3: Int): Int {
//    if (num1 > num2 && num1 > num3) {
//        return num1
//    }
//    if (num2 > num3) {
//        return num2
//    }
//    return num3
    return maxOf(num1, num2, num3)
}

fun diferente(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}

fun par(num: Int): Boolean {
    return num % 2 == 0
}

fun print100Impar() {
    for (num in 1..200 step 2) {
        print("$num, ")
    }
}

fun quatroNums(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

fun print100Pos() {
    for (num in 1..100) {
        print("$num, ")
    }
}