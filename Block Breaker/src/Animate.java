
public class Animate implements Runnable {
     
	blockbreakerpanel bp;
	
    Animate(blockbreakerpanel b) {
		bp = b;
	}
    
    public void run() {
    	while(true) {
    		bp.update();
    		try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    		
    }
}
