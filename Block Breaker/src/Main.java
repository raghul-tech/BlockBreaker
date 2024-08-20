import javax.swing.JFrame;

public class Main {
		//private static final String True = null;

		public static void main(String[] args) {
			JFrame  frame = new JFrame("Block Breaker");
			
			blockbreakerpanel panel = new blockbreakerpanel();
			
			frame.getContentPane().add(panel);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setVisible(true);
			frame.setSize(490,600);
			
			frame.setResizable(false);
			
			
		}
}
