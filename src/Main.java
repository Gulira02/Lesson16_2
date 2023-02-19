import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Backend деген класс тузүңүз жана бир метод кошуңуз.
        //Анын 3 мурас класстарын түзүңүз.
        //Java деген класска spring(), CSharp деген класска dotNet() жана Python деген класска django()
        // методторун түзөсүз.
        //Backend тибин колдонуп массив түзүңүз жана ал жакка анын мурастарын кошуңуз.
        //instanceOf жана getClass() колдонуп Backend массивиндеги тилдердин өздөрүнүн
        // методдорун чыгарыңыз.
        Backend java=new Java();
        java.server();
         Backend python=new Python();
         python.server();

       Backend  csharp=new CSharp();
       csharp.server();

       Backend[] backends={
               java,python,csharp
       };
        for (Backend backend : backends) {

            if (backend instanceof Java) ((Java) backend).spring();

            else if (backend instanceof CSharp) ((CSharp) backend).dotNet();

            else if (backend instanceof Python) ((Python) backend).django();
        }
        System.out.println(backends.getClass());


    }
}

