class PrintNum extends Thread{

    @Override
    public void run() {
        
        for(int i = 1; i <= 10; i++){
            
            System.out.println(i);

            try {
                Thread.sleep(1000);    
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }

    public static void main(String[] args) {
        PrintNum num = new PrintNum();

        num.start();
    }
    
}