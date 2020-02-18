public class Points {

    double point1,point2,point3,point4;
    String ClassName;

    public Points(double p1,double p2,double p3,double p4,String a)
    {

        this.point1=p1;
        this.point2=p2;
        this.point3=p3;
        this.point4=p4;
        this.ClassName=a;

    }

    @Override
    public String toString() {
        return "Points{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
