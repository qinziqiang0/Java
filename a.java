/*
一个Java项目
*/

//导包
import java.util.Scanner;

//a类
public class a {
    //main方法
    public static void main(String[] args) {
        //输出Hello World
        System.out.println("Hello World");
        System.out.println("---------");
        
        //字符串常量
        System.out.println("Hello World");
        System.out.println("JAVA语言");
        System.out.println("---------");
        
        //整数常量
        System.out.println(666);
        System.out.println(-314);
        System.out.println("---------");
        
        //小数常量
        System.out.println(3.141592654);
        System.out.println(8848.86);
        System.out.println("---------");
        
        //字符常量
        System.out.println('G');
        System.out.println('7');
        System.out.println('一');
        System.out.println("---------");
        
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("---------");
        
        //空常量
        //空常量不能直接输出
        //System.out.println(null);
        System.out.println("---------");
        
        //定义变量 变量类型有{byte,short,int,long,float,double,char,boolean}
        int a = 7;
        
        //输出变量
        System.out.println(a);
        
        //修改变量
        a = 12;
        System.out.println(a);
        System.out.println("---------");
        
        //数值类型
        long z = 214748364748L;
        float y = 3.141592654F;
        System.out.println(z);
        System.out.println(y);
        System.out.println("---------");
        
        /*
        标识符
        由{数字,字母,下划线(_),美元符($)}组成
        不能以数字开头
        不能是关键字
        区分大小写
        */
        
        //自动类型转换
        double x = 10;
        System.out.println(x);
        
        //强制类型转换
        z = (int)214748364748L;
        System.out.println(z);
        System.out.println("---------");
        
        //算术运算符
        a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("---------");
        
        //字符的+操作
        System.out.println(a + 'a');
        System.out.println("---------");
        
        //字符串的+操作
        System.out.println("aa" + 100);
        System.out.println(1 + 2 + 3 + "a");
        System.out.println("---------");
        
        //赋值运算符
        int i = 1;
        System.out.println("i:" + i);
        i += 1;//{+=,-=,*=,/=,%=}
        System.out.println("i:" + i);
        System.out.println("---------");
        
        //自增自减运算符
        System.out.println("i:" + i);
        i++;
        System.out.println("i:" + i);
        int a1 = i++;
        System.out.println("a1:" + a1);
        int a2 = i--;
        System.out.println("a2:" + a2);
        int a3 = ++i;
        System.out.println("a3:" + a3);
        System.out.println("---------");
        
        //关系运算符
        int b1 = 10;
        int b2 = 11;
        int b3 = 10;
        System.out.println(b1 == b2);
        System.out.println(b1 == b3);
        System.out.println("---");
        System.out.println(b1 != b2);
        System.out.println(b1 != b3);
        System.out.println("---");
        System.out.println(b1 > b2);
        System.out.println(b1 > b3);
        System.out.println("---");
        System.out.println(b1 >= b2);
        System.out.println(b1 >= b3);
        System.out.println("---");
        System.out.println(b1 < b2);
        System.out.println(b1 < b3);
        System.out.println("---");
        System.out.println(b1 <= b2);
        System.out.println(b1 <= b3);
        System.out.println("---");
        System.out.println("---------");
        
        //逻辑运算符
        System.out.println((b1 > b2) & (b1 > b2));
        System.out.println((b1 < b2) & (b1 > b2));
        System.out.println((b1 > b2) & (b1 < b2));
        System.out.println((b1 < b2) & (b1 < b2));
        System.out.println("---");
        System.out.println((b1 > b2) | (b1 > b2));
        System.out.println((b1 < b2) | (b1 > b2));
        System.out.println((b1 > b2) | (b1 < b2));
        System.out.println((b1 < b2) | (b1 < b2));
        System.out.println("---");
        System.out.println((b1 > b2) ^ (b1 > b2));
        System.out.println((b1 < b2) ^ (b1 > b2));
        System.out.println((b1 > b2) ^ (b1 < b2));
        System.out.println((b1 < b2) ^ (b1 < b2));
        System.out.println("---");
        System.out.println(b1 > b2);
        System.out.println(!(b1 > b2));
        System.out.println("---------");
        
        //短路逻辑运算符
        System.out.println((b1++ > b2) && (b3++ > b2));
        System.out.println("b1:" + b1);
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);
        System.out.println("---------");
        
        //三元运算符
        int max = b1 > b2 ? b1 : b2;
        System.out.println("max：" + max);
        
        //<两只老虎>
        b1 = 180;
        b2 = 200;
        boolean c = b1 == b2 ? true : false;
        System.out.println(c);
        System.out.println("---------");
        
        //<三个和尚>
        b1 = 150;
        b2 = 165;
        b3 = 210;
        int b4 = b1 > b3 ? b1 : b2;
        int b5 = b4 > b3 ? b4 : b3;
        System.out.println("最高身高为：" + b5);
        
        //数据输入
        //创建对象
        Scanner o = new Scanner(System.in);
        //接收数据
        i = o.nextInt();
        System.out.println("你输入的是：" + i);
    }
}
