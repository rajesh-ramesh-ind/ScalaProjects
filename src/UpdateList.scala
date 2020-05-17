object UpdateList {
  def main(args: Array[String]): Unit = {
    val arr = List.range(-4, 4)
    print(arr.map(_.abs))
  }
}
