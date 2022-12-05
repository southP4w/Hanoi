public class Main
{
	public static void main(String[] args) {
		hanoi(4, 'A', 'B', 'C');
	}

	private static void hanoi(int n, char pegFrom, char pegMid, char pegTo) {
		if (n==1) {
			System.out.println("Disk 1 moved from peg " + pegFrom + " to peg " + pegTo);
			return;
		}
		hanoi(n-1, pegFrom, pegTo, pegMid);
		System.out.println("Disk " + n + " moved from peg " + pegFrom + " to peg " + pegTo);
		hanoi(n-1, pegMid, pegFrom, pegTo);
	}
}