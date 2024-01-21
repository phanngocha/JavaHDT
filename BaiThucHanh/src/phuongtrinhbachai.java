import java.util.Scanner;

public class phuongtrinhbachai {
        public static void main(String[] args) {
            double a,b,c,x1,x2,delta;
            Scanner sc= new Scanner(System.in);
            System.out.print("Nhap a = ");
            a= sc.nextDouble();
            System.out.print("Nhap b = ");
            b=sc.nextDouble();
            System.out.print("Nhap c = ");
            c=sc.nextDouble();
            if(a==0){
            System.out.println("Khong phai phuong trinh bac hai");
                    } else{
                        delta= Math.pow(b,2)-4*a*c;
                        if(delta<0){System.out.print("phuong trinh vo nghiem");}
                        else{ if(delta==0){
                        x1=x2=-b/2*a;
                      System.out.print("Phuong trinh co nghiem kep x1 = x2 = "+x1);
                           } else{
                            x1=((-b) + Math.sqrt(delta)) /2*a;
                            x2=((-b) - Math.sqrt(delta)) /2*a;
                            System.out.print("Phuong trinh co 2 nghiem,  x1 = "+ x1 +", x2 = "+x2);
                                 }
                        }
                }
        }
    
}
