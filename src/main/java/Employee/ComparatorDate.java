package Employee;

import java.util.Comparator;

public class ComparatorDate implements  Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDateAcceptance().compareTo(o2.getDateAcceptance());
    }
}
