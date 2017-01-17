import java.util.Scanner;
/**
 * Created by Cavan on 2017/1/17.
 */
public class FirstClass {
    public static void main(String args[]) {

        System.out.println("Hello, world!");

        //一. 简单数据类型
        //JAVA中有8中基本数据类型: boolean, byte, int, short, long, float, double, char;
        //逻辑类型: boolean
        //整数类型: byte, short, int, long
        //字符类型: char
        //浮点类型: float, double

        //1. 逻辑类型
        boolean x = true;
        boolean y = false;
        if (x && y) {
            System.out.println("x, y为真!");
        } else if (!x && y){
            System.out.println("x为假, y为真!");
        } else if (!x && !y) {
            System.out.println("x, y均为假!");
        } else {
            System.out.println("x为假, y为真!");
        }

        //2. 整数类型
        byte c = -12, tom = 28;
        short d = 30;//等价于2byte
        int a = 10, b = 20;//等价于4byte
        long e = 60;//等价于8byte

        //3. 字符类型
        char f = 'a';//等价于2byte
        char c1 = '\n';//占位符:换行
        char c2 = '\b';//占位符:退格
        char c3 = '\t';//占位符:return
        char c4 = '\'';//占位符:单引号
        char c5 = '\'';
        char c6 = '\\';//占位符:反斜杠线
        char c7 = '\r';//占位符:回车符

        //4. 读点类型
        float d1 = 123.456f;//等价于4byte
        double d2 = 123.123D;//等价于8byte

        //二. 数据类型的转换
        //精度从低到高: byte, short, char, int, long, float, double
        //从低等级的变量赋值给级别高的变量, 系统会自动完成数据类型的转换
        int value1 = 50;
        float value2;
        value2 = value1;
        System.out.println(value2);
        //从高等级的变量赋值给级别低的变量, 必须用显示类型转换运算
        int number1 = (int)34.89;
        long number2 = (long)2556F;
        System.out.println(number1 +"\n"+ number2);

//        Scanner reader = new Scanner(System.in);
//        reader.next();
//        System.out.println(reader);

        /*
        //三. 命令行输入输出函数
        Rect rectangle = new Rect();
        Scanner reader = new Scanner(System.in);
        System.out.println("输入矩形的宽, 并回车确认!");
        rectangle.width = reader.nextDouble();
        System.out.println("输入矩形的高, 并回车确认!");
        rectangle.height = reader.nextDouble();
        double area = rectangle.getArea();
        System.out.println("矩形的面积是:" +area);
*/
        //四.
        Statement states = new Statement();
        Statement.Vehicle vehicle = new Statement.Vehicle();
        double aaa = vehicle.speedUp(10.0, 40.0);
        System.out.println(aaa);
    }
}
