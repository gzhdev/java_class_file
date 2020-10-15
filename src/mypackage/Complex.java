package mypackage;
//第2题附件
public class Complex {//复数的运算类
    private double real;
    private double imag;
    //构造方法，一定是Public + 类名
    public Complex(){ //无参数构造方法
        real = 1.0;
        imag = 1.0;
    }
    /*
    public Complex(double real){//单参
    }

     */
    public Complex(double real,double imag){//多参
        this.real=real; //this指当前对象
        this.imag=imag;
    }
    //封装方法
    public void setImag(double imag){
        this.imag=imag;
    }
    public double getImag(){
        return imag;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getReal(){
        return real;
    }
    /*
    public Complex add(Complex c){
        Complex nc=new Complex(this.real+c.real,this.imag+c.imag);
    }
     */
    public void add(Complex c){
        this.real+=c.real;
        this.imag+=c.imag;
    }
    public void subtract(Complex c){
        this.real-=c.real;
        this.imag-=c.imag;
    }
    public String toString(){
        return real+"+"+imag+"i";
    }
}
