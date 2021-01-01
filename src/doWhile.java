public class doWhile {

    public static void main(String[] args) {

    int a = 7; int b;

        System.out.println("------------FEATURE-2");
        System.out.println();
do {

    b = a % 2;
    a = (a / 2);
    System.out.print(b);

}while  (a!=0);
        System.out.println();
        System.out.println();
        System.out.println("------------FEATURE-3");

       // int [][] chessTable = new int [8][8];  //zainicjowanie noewj rablicy 8 wierszy 8 kolumn
        int [][] chessTable  = {{0,0,0,0,1,0,0,0}, //1 -czarne , 2 -białe, 3-wieża
                                {1,1,1,1,0,0,0,1},
                                {0,0,1,0,0,0,1,0},
                                {1,0,0,0,3,0,2,1},
                                {0,0,0,2,0,1,2,0},
                                {0,0,2,0,2,2,0,0},
                                {2,2,0,0,0,2,2,2},
                                {1,0,2,0,0,0,0,1}};

        char [] chessRows = {'a','b','c','d','e','f','g','h'};

        int x = 3; int y = 4; //położenie wieży
        int n = x; int m = y; //położenie wieży
            // sprawdzenie obecności czernych w zasiegu wieży (kolumny) od wieży do góry

        do {
            if (chessTable[n][m] ==2) {
           n=-1;// jesli biały zakończ szukanie
            }

       else if (chessTable[n][m] ==1){
    System.out.println("pozycja przeciwnika wieży: " + chessRows[m] +" " + (8-n));
    n=-1;}
    else  n--;

        }while (n>-1);
        n = x;  m = y; //położenie wieży
        // sprawdzenie obecności czernych w zasiegu wieży (kolumny) od wieży do dołu

        do {
            if (chessTable[n][m] ==2) {
                n=8;// jesli biały zakończ szukanie
            }

            else if (chessTable[n][m] ==1){
                System.out.println("pozycja przeciwnika wieży: " + chessRows[m] +" " + (8-n));
                n=8;}
            else  n++;

        }while (n<8);


        // sprawdzenie obecności czarnych w zasiegu wieży (wiersze) w prawo
        n = x;  m = y;
        do {
            if (chessTable[n][m] ==2){ // jesli biały zakończ szukanie
                m=8;
            }
            else if (chessTable[n][m] ==1){
                System.out.println("pozycja przeciwnika wieży: " + chessRows[m] +" " + (8-n));
                m=8;}
            else  m++;

        }while (m<8);

// sprawdzenie obecności czarnych w zasiegu wieży (wiersze) w lewo
        n = x;  m = y;
        while (m>-1) {
            if (chessTable[n][m] ==2){ // jesli biały zakończ szukanie
                m=-1;
            }

            else if (chessTable[n][m] ==1){
                System.out.println("pozycja przeciwnika wieży: " + chessRows[m] +" " + (8-n));
                m=-1;}
            else  m--;

        }

}
}
