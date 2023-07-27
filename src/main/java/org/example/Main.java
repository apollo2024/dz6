package org.example;

public class Main {
    public static void main(String[] args) {
            int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            RedBLackTree tree = new RedBLackTree(elements);

            printRedBLackTree(tree.getRoot(), "", true);
        }
        private static void printRedBLackTree(RedBLackTree.Node node, String indent, boolean last){
            if (node != null) {
                System.out.print(indent);
                if (last) {
                    System.out.print("\u001B[31m" + "⬤" + "\u001B[0m" + "----");
                    indent += "     ";
                } else {
                    System.out.print("\u001B[30m" + "⬤" + "\u001B[0m" + "----");
                    indent += "|    ";
                }

                String color = node.isRed ? "\u001B[31m" : "\u001B[30m";
                System.out.println(node.key + "(" + color + "⚫" + "\u001B[0m" + ")");
                printRedBLackTree(node.left, indent, false);
                printRedBLackTree(node.right, indent, true);
            }
    }
}
