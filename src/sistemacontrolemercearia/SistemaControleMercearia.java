package sistemacontrolemercearia;

/**
 *
 * @author Belmiro-Mungoi
 */

import java.io.*;
import java.text.DecimalFormat;

public class SistemaControleMercearia {


    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        menu();
    }
    
    public static void lerProdutos(int a) throws IOException{
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat b = new DecimalFormat("#,###.00 MZN");
        String produto; int quan = lerQuantidade(a);
   
    
        for(int i = 1; i <= quan; i++){
            System.out.print("Insira o produto: ");
            produto = br.readLine(); 
            double preco = lerPreco(a);
            System.out.println("O produto insirido foi " + produto + 
                " o seu preco e: " +b.format(preco) +"\n");
        }
    }
    
    public static int lerQuantidade(int a) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int quan;
    
        do{
            System.out.print("Insira a quantidade de produtos: ");
            quan = Integer.parseInt(br.readLine());
            if (quan <= 0)
                System.out.println("Quantidade Invalida");
            //System.out.print(quan);
        }while(quan <= 0);
    return quan;
    }
    
    public static double lerPreco(double a) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
       // DecimalFormat b = new DecimalFormat("#,###.00 MZN");
        double preco;
    
        do{
            System.out.print("Insira o preco do produto: ");
            preco = Double.parseDouble(br.readLine());
            if (preco < 10)
                System.out.println("Preco muito baixo");
            //System.out.println(b.format(preco));
        }while(preco < 10);
    return preco;
    }
    
    public static void menu() throws IOException {
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        int op;
       
        do{
            System.out.println("\tM E N U\n1.Insirir Produto\n2.Ver Produtos"
                + "\n3.Ver Produto Mais Caro e Barato\n4.Ver o Lucro");
            op = Integer.parseInt(br.readLine());
    
            switch(op){
                case 1 : lerProdutos(0); break;
                case 2 : System.out.print("Ainda por fazer"); break;
                case 3 : System.out.print("Ainda por fazer"); break;
                case 4 : System.out.print("Ainda por fazer"); break;
                default: System.out.println("Opcao Invalida"); break;
            } 
        }while(op > 4);
    }
}
