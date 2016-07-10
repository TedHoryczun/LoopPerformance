
public class LoopPerformance {
	private static LoopPerformance[] mArray = new LoopPerformance[5];
	private static int mExplode;
	public static void main(String[] args){
		two();
		
	}
		public static void standardForLoop() {
			long zeroStartTime = System.nanoTime();
		    int total = 0;
		    for (int i = 0; i < mArray.length; ++i) {
		        total += mArray[i].mExplode;
		    }
		    long zeroStopTime = System.nanoTime();
			System.out.println("zero: " + (zeroStopTime - zeroStartTime));
		}

		public static void savedForLoop() {
			long oneStartTime = System.nanoTime();
		    int total = 0;
		    LoopPerformance[] localArray = mArray;
		    int len = localArray.length;

		    for (int i = 0; i < len; ++i) {
		        total += localArray[i].mExplode;
		    }
		    long oneStopTime = System.nanoTime();
			System.out.println("one: " + (oneStopTime - oneStartTime));
		}

		public static void enhancedForLoop() {
			long twoStartTime = System.nanoTime();
		    int total = 0;
		    for (LoopPerformance a : mArray) {
		        total += a.mExplode;
		    }
		    long twoStopTime = System.nanoTime();
			System.out.println("two: " + (twoStopTime - twoStartTime));
	}
}
