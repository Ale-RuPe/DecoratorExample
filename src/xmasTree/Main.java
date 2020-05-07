package xmasTree;

public class Main {
	public static void main(String[] args) {
		ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
		tree1 = new BubbleLights(tree1);
		tree1 = new Garland(tree1);
		tree1 = new Tinsel(tree1);
		tree1 = new TreeTopper(tree1);
		System.out.println(tree1.decorate());
	}
}
