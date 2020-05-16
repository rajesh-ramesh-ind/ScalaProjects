object FilterByElement {
  def main(args: Array[String]): Unit = {
    val arr = Range(0, 10).toList.filter(_ % 2 == 0)
    print(arr)
  }
}
