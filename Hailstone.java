import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Hailstone implements Iterable<Integer> {
    private Integer Element;
    private boolean isLastElement;
    private List<Integer> listElements;

    Hailstone(Integer a0) {
        Element = a0;
        isLastElement = false;
        listElements = new LinkedList<>();
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
                listElements.add(tmp);
                return tmp;
            }
        };
    }

    public List<Integer> getElements() {return listElements;}
}