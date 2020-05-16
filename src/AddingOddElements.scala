object AddingOddElements {
  def main(args: Array[String]): Unit = {
    val arr = Range(1, 100, 3).toList
    print(arr.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).sum)
  }
}
