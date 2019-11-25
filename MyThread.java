public class MyThread extends Thread {
    public int number;
    public MyThread(int n){
        this.number = n;
    }
    public void run() {
        for(int i=0;i<=12;i++){
            System.out.println(number+" x "+i+" = "+ number*i);
        }
    }
}   