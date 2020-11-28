package cn.cyz.softwaretest.test1;


import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;

public class MathUsage {

    //主函数
    public static void main(String[] args) {
        MathUsage myuse = new MathUsage();
        //数据
        double[] values = new double[] {3.59, 4.01,3.69, 4.26, 2.95, 3.26, 3.56, 3.46, 3.58, 3.17, 3.59, 0.66 };

        //调用方法
        Min min = new Min();//最大
        Max max = new Max();//最小
        Mean mean = new Mean();//算数平均值
        int pass = myuse.isPass(values);//挂科数

        //输出
        System.out.println("成绩分析结果如下：");
        System.out.println("最低绩点: " +min.evaluate(values));
        System.out.println("最高绩点: " +max.evaluate(values));
        System.out.println("平均绩点: " +mean.evaluate(values));
        System.out.println("挂科数: "+pass);
    }

    public int isPass(double[] values) {//判断是否挂科，未挂科返回0，否则返回挂科数
        int num = 0;//用来返回挂科数
        for(double i : values){//检查每学科绩点
            if(i < 1){
                num ++;
            }
        }
        return num;
    }
}
