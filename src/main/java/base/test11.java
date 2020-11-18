package base;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/10/11 10:21 下午
 */
public class test11
{
  public static void main(string[]args)
   {
       EnclosingOne eo = new EnclosingOne();
       EnclosingOne.InsideOne e = eo.new InsideOne();
       EnclosingOne.InsideOne ei=eo.new InsideOne();
  }


}

class EnclosingOne {
    public class InsideOne {}
}