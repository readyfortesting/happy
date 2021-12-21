package Java_Practise_20Dec;

import java.util.Arrays;
import java.util.HashSet;

public class Ex06 {

	public static void main(String[] args) {
        // Soru 1 : Bir HashSet random olarak 10(set.size(10)) adet olacak �ekilde
        // 1 den 20 e kadar olan say�larla doldurup yazd�r�n
        // Soru 2 : Bu SET i bir fonksiyonda diziye �evirinizve yazd�r�n�z.

        HashSet<Integer> hs=generateSet();
        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        Integer[] dizi=convertToArray(hs);
        System.out.println("dizi = " + Arrays.toString(dizi));
    }

    public static Integer[] convertToArray(HashSet<Integer> hs)
    {
        //1.Y�ntem
        Integer[] dizi=new Integer[hs.size()];

        int index=0;
        for(int e : hs)
        {
            dizi[index]=e;
            index++;
        }

        //2.Y�ntem
        dizi = hs.toArray(new Integer[hs.size()]);

        return dizi;
    }

    public static HashSet<Integer> generateSet()
    {
        HashSet<Integer> set = new HashSet<>();

        int a = 0;
//        for (int i = 0; i < 10; i++) {
//            a = (int) (Math.random() * 20);
//            set.add(a);
//        }

        while(set.size() < 10)
        {
            a = (int) (Math.random() * 20);
            set.add(a);
        }
        return set;
    }
}
