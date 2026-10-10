// List, Map

fun main() {

    // 1. List : 불변 리스트(순서가 있는 데이터 집합, 데이터 중복 허용)
    val list = listOf<Int>(10, 20, 30)

    println(
        """
        list size : ${list.size}
        list data : ${list[0]}, ${list[1]}, ${list.get(2)}
        """.trimIndent()
    )

    // list.add(40) // Error! : listOf()로 만든 List는 데이터를 추가하거나 변경할 수 없음(불변 타입)

    // 2. MutableList : 가변 리스트
    val mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)   // index 3에 40 추가
    mutableList.add(0, 50)   // index 0에 50 추가

    println(
        """
        mutableList size : ${mutableList.size}
        mutableList data : ${mutableList[0]}, ${mutableList.get(1)},
                           ${mutableList[2]}, ${mutableList[3]}, ${mutableList[4]}
        """.trimIndent()
    )

    // 3. Map : Key와 Value로 데이터 저장
    val map = mapOf<String, String>(
        Pair("one", "hello"),
        "two" to "world"
    )

    println(
        """
        map size : ${map.size}
        map data : ${map.get("one")}, ${map.get("two")}
        """.trimIndent() //key 호출하면 값이 나옴
    )
}

//List, Set, Map은 불변 타입, MutableList, MutatbleSet, MutableMap은 가변 타입(데이터를 추가하거나 변경할 수 있음)