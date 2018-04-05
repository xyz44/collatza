class Test {
    public static void main(String[] args) {
        int ini = 77031, count = -1, maxel = 0;
        Hailstone hailstone = new Hailstone(ini);
        for (int h : hailstone) {
            if (h > maxel) maxel = h;
            ++count;
        }
        System.out.println(ini + " " + count + " " + maxel);
<<<<<<< HEAD
=======
        System.out.println("===========================");

//        for(Integer elem : hailstone.getElements())
//            System.out.println(elem);
>>>>>>> c4f672427ff7dfb445c707fcade32cf25949b0fa
    }
}
