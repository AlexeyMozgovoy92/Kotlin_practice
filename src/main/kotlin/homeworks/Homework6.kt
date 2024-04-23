package homeworks


fun arrayPrint() {
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    array1[0] = 1
    array1[1] = 2
    array1[2] = 3
    array1[3] = 4
    array1[4] = 5
}

//Создайте пустой массив строк размером 10 элементов.
val array2: Array<String?> = arrayOfNulls(10)



fun arrays(): DoubleArray {
    val array3: DoubleArray = DoubleArray(5)
    for (i in array3.indices) {
        array3[i] = i * 2.0
    }
    return array3
}



