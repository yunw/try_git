package FromQ;

public class ThreadUtitlitiesTest {

	public void test(){
		Thread t1 = new Thread(new TestThread(), "t1");
		Thread t2 = new Thread(new TestThread(), "t2");
		t1.start();
		t2.start();
		
		Thread[] allThreads = ThreadUtilities.getAllThreads();
		for(Thread t : allThreads){
			System.out.println("thread name is :" + t.getId() + "-" + t.getName()
					+ "-" + t.getThreadGroup().getName());
		}
	}
	public static void main(String args[]){
		ThreadUtitlitiesTest t = new ThreadUtitlitiesTest();
		t.test();
	}
	
	
}
class TestThread implements Runnable{

	public void run() {
		int i = 3;
		int k = 0;
		while(i>2){
			k += 1;
			//System.out.println(" looping ...." + k);
			try
			{
			Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			return;
			} 
		}
		
	}
	
}