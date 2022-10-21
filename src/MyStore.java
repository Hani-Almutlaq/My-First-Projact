import java.util.Scanner;
public class MyStore {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Phones phOne = new Phones("iPhone 13.");
        phOne.phs(256);
        phOne.php(904);
        Phones phTwo = new Phones("Galaxy s22.");
        phTwo.phs(512);
        phTwo.php(1199);
        Phones phThree = new Phones("Huawei p50 pocket.");
        phThree.phs(512);
        phThree.php(1699);
        
        System.out.println("Welcom To My Store!\n-------*****-------");
        
        boolean loop = true;
        
        do {
        System.out.println("Choose a phone please:");
        System.out.println("1-iPhone 13.\n2-Galaxy s22.\n3-Huawei p50 pocket.");
        int a = scan.nextInt();
        System.out.println("-------*****-------");
        
        switch(a) {
            case 1:
                phOne.print();
                System.out.println("1-buy.\n2-go back.");
                int bg1 = scan.nextInt();
                if(bg1 == 1) {
                    System.out.println("Congratulations! we will deliver it to you.");
                    loop = false;
                }
                else if(bg1 == 2){
                    loop = true;
                }
                else {
                    System.out.println("Please choose 1 or 2.");
                }
                break;
            case 2:
                phTwo.print();
                System.out.println("1-buy.\n2-go back.");
                int bg2 = scan.nextInt();
                if(bg2 == 1) {
                    System.out.println("Congratulations! we will deliver it to you.");
                    loop = false;
                }
                else if(bg2 == 2){
                    loop = true;
                }
                else {
                    System.out.println("Please choose 1 or 2.");
                }
                break;
            case 3:
                phThree.print();
                System.out.println("1-buy.\n2-go back.");
                int bg3 = scan.nextInt();
                if(bg3 == 1) {
                    System.out.println("Congratulations! we will deliver it to you.");
                   loop = false;
                }
                else if(bg3 == 2){
                    loop = true;
                }
                else {
                    System.out.println("Please choose 1 or 2.");
                }
                break;
            default:
                System.out.println("Please choose 1, 2, or 3.");
        }
        }while(loop);
        
    }
    
}
