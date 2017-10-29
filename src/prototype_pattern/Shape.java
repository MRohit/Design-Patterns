package prototype_pattern;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id){
        this.id=id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
    }
}
