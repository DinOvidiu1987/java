import com.sun.deploy.security.SelectableSecurityManager;

public class Exercitii {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i > j) {
                break;
            }
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " and j = " + j);


        int a = 1, b = 0 ;
        switch (i)
        {
            case 2: b +=6;
            case 4: b+=1;
            default: b +=2;
            case 0: b+= 4;
        }
        System.out.println("b = " + b);
        {
            int n = 5;
            int m = ++n;
            System.out.println(" m este egal cu " + ++n);
        }

            int g = 30;
        if(g > 20 )
        {
            System.out.println("adevarat");
        }
         else {
            System.out.println(" fals");
        }

         int t = 5;
         switch(t) {
             case 1:
                 System.out.println("1");
             case 2:
                 System.out.println("2");
             case 3:
                 System.out.println("3");
                 break;

             default:
                 System.out.println("altceva in afara DE 1, 2 SAU 3" );
                 break;

         }
            int p = 1, u = 0;
         switch (p )
         {
             case 2: p+=6;
             case 4: u+=1;
             defaul: u+=2;
             case 0: u+=7;
         }
        System.out.println("u = "+ u);
    }
}
