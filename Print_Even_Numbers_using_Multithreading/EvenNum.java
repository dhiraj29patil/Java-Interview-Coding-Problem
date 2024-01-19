class EvenNum implements Runnable{


    public static void main(String[] args) {
        EvenNum num = new EvenNum();

        Thread t = new Thread(num);

        t.start();
    }

    @Override
    public void run() {
        
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                try{
                    System.out.println(i);
                    Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}