/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/26 17:01
 */

/**
 * 枚举实现单例模式
 */
public enum  Singleton6 {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
