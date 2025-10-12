package HomeWork01.HomeWork09;

public class LabelePoint extends Point{
    private String name;
    public LabelePoint(double x, double y,String name) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
