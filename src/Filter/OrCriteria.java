package Designpattern.Filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons){

        List<Person> firsCriteriatPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firsCriteriatPersons);

    }
}
