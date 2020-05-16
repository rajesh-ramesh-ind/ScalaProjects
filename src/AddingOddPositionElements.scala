object AddingOddPositionElements {
  def main(args: Array[String]): Unit = {
    val arr = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
    print(arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1))
    print(arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1).sum)
  }
}
