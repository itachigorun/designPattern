/**
 * Description:
 *
 * @author houkepan
 * @date 2018/12/29 10:47
 */
public class Resume implements Cloneable {
    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;

    /**
     * 构造函数：初始化简历赋值姓名
     */
    public Resume(String name) {
        this.name = name;
    }

    /**
     * 设定个人基本信息
     */
    public void setPersonInfo(String birthday, String sex, String school) {
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * 设定工作经历
     */
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 克隆该实例
     */
    @Override
    public Object clone() {
        Resume resume = null;
        try {
            // 复制类的对象，如果类中有类，克隆的是引用
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }

    public void display() {
        System.out.println("姓名：" + name);
        System.out.println("生日:" + birthday + ",性别:" + sex + ",毕业学校：" + school);
        System.out.println("工作年限:" + timeArea + ",公司:" + company);
    }

}
