import static java.lang.Math.*;

public final class MathBis {
    public static double asinh(double x){
        return log(x+Math.sqrt(x*x+1));
    }

    public static double acosh(double x){
        return log(x+Math.sqrt(x*x-1));

    }

}


