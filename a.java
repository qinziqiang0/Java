/*
一个Java项目
*/

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
    }
}
