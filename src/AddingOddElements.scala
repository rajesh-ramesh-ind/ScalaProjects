object AddingOddElements {
  def main(args: Array[String]): Unit = {
    val arr = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
    print(arr.filter(_ % 2 != 0).sum)
  }
}
