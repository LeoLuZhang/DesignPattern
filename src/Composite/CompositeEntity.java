package Composite;

/**
 * Composite
 * Leo
 * 2018/10/13
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1,String data2){
        cgo.setData(data1,data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
