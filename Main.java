public class Main {
    public static void main(String[] args) {

        AList<String> aList = new AList<>();
        aList.addy("Song 1");
        aList.addy("Song 2");
        aList.addy("Song 3");
        System.out.println("AList contents:\n" + aList);
        aList.removy(1);
        System.out.println("AList after removal:\n" + aList);


        SLList<String> slList = new SLList<>();
        slList.addy("Track A");
        slList.addy("Track B");
        slList.addy("Track C");
        System.out.println("SLList contents:\n" + slList);
        slList.removy(1);
        System.out.println("SLList after removal:\n" + slList);


        DLList<String> dlList = new DLList<>();
        dlList.addy("Tune E");
        dlList.addy("Tune F");
        dlList.addy("Tune Gz");
        System.out.println("DLList contents:\n" + dlList);
        dlList.removy(1);
        System.out.println("DLList after removal:\n" + dlList);
    }
}
