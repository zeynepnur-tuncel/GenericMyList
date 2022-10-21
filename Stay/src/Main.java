public class Main {
    public static void main(String[] args) {
    /*
        MyList<Integer> list=new MyList<>();
        System.out.println("Dizideki eleman sayısı : " +list.size());
        System.out.println("Dizinin kapasitesi : " +list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Dizideki eleman sayısı : " +list.size());
        System.out.println("Dizinin kapasitesi : " +list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki eleman sayısı : " +list.size());
        System.out.println("Dizinin kapasitesi : " +list.getCapacity());


    }*/
        /*
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("2.indisteki değer : : " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0,100);
        System.out.println("2.indisteki değer : : " + list.get(2));
        System.out.println(list.toString());
       */
        MyList<Integer> liste = new MyList<>();
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(20);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // Bulduğu ilk indeksi verir
        System.out.println("Indeks : " + liste.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + liste.indexOf(100));

        // Bulduğu son indeksi verir
        System.out.println("Indeks : " + liste.lastIndex(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = liste.toArr();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        // Liste veri türünde alt bir liste oluşturdu
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());

        // Değerim listedeki olup olmadığını sorguladı
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
        liste.clear();
        System.out.println(liste.toString());


    }
    }