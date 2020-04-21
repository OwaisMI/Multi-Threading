
class A extends Thread{
        @Override
	public void run() {
		System.out.println("Thread A Started");
		for(int i=0;i<=5;i++) {
		System.out.println("A="+i);
	}System.out.println("End of Thread A");
		}
	
	
}
class B extends Thread{
        @Override
	public void run() {
		System.out.println("Thread B Started");
		for(int j=0;j<=5;j++) {
		System.out.println("B="+j);
	}System.out.println("End of Thread B");
		}
	
	
}
class C extends Thread{
        @Override
	public void run() {
		System.out.println("Thread C Started");
		for(int k=0;k<=5;k++) {
		System.out.println("C="+k);
	}System.out.println("End of Thread C");
		}
	public static class MainThreading {
		public static void main (String[] args) {
			new A().start();
			new B().start();
			new C().start();
		}
	}
	
	
}