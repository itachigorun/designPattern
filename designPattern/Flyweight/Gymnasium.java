/**
 * Description:
 *
 * @author houkepan
 * @date 2019/3/8 15:56
 */
public class Gymnasium implements Building {
    private String name;
    private String shape;
    private String sport;

    public Gymnasium(String sport) {
        this.setSport(sport);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public void use() {
        System.out.println("该体育馆被使用来召开奥运会" + " 运动为: "
                + sport + "形状为:" + shape + "名称为:" + name);
    }
}
