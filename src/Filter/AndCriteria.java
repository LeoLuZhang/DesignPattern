package Designpattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons){

        List<Person> firsCriteriatPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firsCriteriatPersons);

    }
}
