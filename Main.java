public class Main implements Cloneable
{
    public static void main (String[] args) throws CloneNotSupportedException {
        Arvore<String> a = new Arvore<String>();
        Arvore<Integer> b = new Arvore<Integer>();


        try {
            a.inclua("Java");
            a.inclua("C++");
            a.inclua("C#");
            a.inclua("Python");



           b.inclua(10);
            System.out.println(b);
            b.inclua(5);
            System.out.println(b);
            b.inclua(15);
            System.out.println(b);
            b.inclua(3);
            System.out.println(b);
            b.inclua(7);
            System.out.println(b);
            b.inclua(12);
            System.out.println(b);
            b.inclua(20);
            System.out.println(b);
            b.inclua(1);
            System.out.println(b);
            b.inclua(4);
            System.out.println(b);
            b.inclua(6);
            System.out.println(b);
            b.inclua(8);
            System.out.println(b);
            b.inclua(11);
            System.out.println(b);
            b.inclua(13);
            System.out.println(b);
            b.inclua(19);
            System.out.println(b);
            b.inclua(25);
            System.out.println(b);


            System.out.println("--------------------------------------------------------------------------------------------");

            b.exclusao(25);
            System.out.println(b);
            b.exclusao(20);
            System.out.println(b);
            b.exclusao(5);
            System.out.println(b);


        } catch (Exception erro) {
        }


        /*                Print da arvore            */
//		System.out.println(a);



        /*           TESTE DO Metodo getQtdNos()            */
//		System.out.println(a.getQtdNos()); // 4



        /*            TESTE DO Metodo TEM()            */
//		System.out.println(a.tem("Java")); // true
//		System.out.println(b.tem(2)); // false (null)


        /*             TESTE DO EQUALS              */
//		System.out.println(a.equals(b));


        /*             TESTE DO CLONE              */
//		Arvore<String> c = (Arvore<String>) a.clone();
//		System.out.println(c);


        /*		TESTE EXCLUSÃO FOLHA 	*/

    }
}