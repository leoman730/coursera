import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnionUFModified uf = new WeightedQuickUnionUFModified(N);
        StdOut.println(Arrays.toString(uf.getID()));
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println("connect: " + p + " " + q);
            StdOut.println(Arrays.toString(uf.getID()));
        }
        StdOut.println(uf.count() + " components");


        StdOut.println(Arrays.toString(uf.getID()));
	}
}


