package poo;

public class Main {


    public static void main(String[] args) {
	// write your code here

        double div2,soma2=0,soma3=1,div3,soma1=0,div1;

    //Primeira soma
        int numeros=1,nImpar=1;
        while (numeros<=50)
        {
            div1=(float) nImpar/numeros;
            soma1+= div1;


            numeros++;
            nImpar+=2;
        }
    // Segunda soma
        int denominador=50;
        for (int i=1;i<=50;i++)
        {
            div2=(Math.pow(2,i)/denominador--);
            soma2+=div2;
        }

        //Terceira soma
        int k=0;
        for(int i=2;i<=10;i++)
        {
            div3=(float)i/(i*i);

            if (k==0)
            {
                soma3-= div3;
                k=1;
            }else
                {
                    soma3+=div3;
                    k=0;
                }




        }


        System.out.println("primeira soma "+ soma1);
        System.out.println("Segunda soma "+soma2);
        System.out.print("Terceira soma "+ soma3);

    }
}
