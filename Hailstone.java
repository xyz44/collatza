import java.util.Iterator;

class Hailstone implements Iterable<Integer> {
    private Integer Element;
    private boolean isLastElement;

    Hailstone(Integer a0) {
        Element = a0;
        isLastElement = false;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return !isLastElement;
            }

            @Override
            public Integer next() {
                int tmp = Element;

                if (Element%2 == 0)
                    Element /= 2;
                else {
                    if (Element == 1)
                        isLastElement = true;
                    Element = 3 * Element + 1;
                }
                return tmp;
            }
        };
    }
}