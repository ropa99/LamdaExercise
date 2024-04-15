package se.lexicon.LambdaExercises;
import java.util.List;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    static Conditional getZeroStock = (Product p)-> ( p.getStock() < 1 );

    public static void main( String[] args )
    {
        List<Product> productList = new ArrayList();

        Product p1 = new Product("Lemmon",10,1);
        productList.add(new se.lexicon.LambdaExercises.Product("Apple",20,10));
        productList.add(new se.lexicon.LambdaExercises.Product("Päron",30,0));
        productList.add(new se.lexicon.LambdaExercises.Product("Banana",30,0));
        productList.add(new se.lexicon.LambdaExercises.Product("Bananarama",30,10));

        productList.add(p1);



        Conditional getProductB = (p) -> p.getProductName().startsWith("B");

        for (Product p:productList){
            if (getZeroStock.test(p))
                System.out.println(p);
        }

        for (Product p:productList){
            if (getProductB.test(p))
                System.out.println(p);
        }



    }
}
