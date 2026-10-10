// 7. 컬렉션(Array, List, Set, Map)
// Array, Set
// Array: 배열 표현
fun main() { //arrayof 쓰면 배열 선언할 때 값 할당 가능
    
    val data1: Array<Int> = Array(3, { 0 }) //첫 번째 인자가 3, 두번째 인자는 0을 반환하는 람다 함수(이름 없이 만드는 함수)
    //0으로 초기화한 데이터를 3개 나열한 정수형 배열 선언
    
    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30) //배열의 2번 데이터를 30으로 설정

    println(
        """
        array size : ${data1.size}
        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
        """.trimIndent()
    )

    val data2: Array<Int> = arrayOf(10, 20, 30) //Array<Int>같이 제네릭으로 명시함

    println(
        """
        array size : ${data2.size}
        array data : ${data2[0]}, ${data2[1]}, ${data2.get(2)}
        """.trimIndent()
    )

    val data3: BooleanArray = booleanArrayOf(true, false, true) //데이터가 기초 타입인 경우, IntArray, CharArray 클래스 등 이용 가능

    println(
        """
        boolean array size : ${data3.size}
        boolean array data : ${data3[0]}, ${data3[1]}, ${data3.get(2)}
        """.trimIndent()
    )

    val data4: Set<Int> = setOf(10, 20, 20, 30) //Set: 순서 없음, 데이터 중복 허용 x(값 사라짐)

    println("set size : ${data4.size}")
    println("set data : $data4")
}
//Array: 배열, Set: 순서가 없는 데이터 집합, 중복 허용 x