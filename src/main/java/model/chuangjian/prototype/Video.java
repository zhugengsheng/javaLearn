package model.chuangjian.prototype;

import java.util.Date;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/8/23 2:01 下午
 */
public class Video implements Cloneable {
    private String name;
    private Date createTime;
    private int i;

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); 浅克隆
        Object clone = super.clone();
        Video v = (Video) clone;
        this.createTime = (Date) v.createTime.clone();
        return clone;
    }

    public Video(String name, Date createTime, int i) {
        this.name = name;
        this.createTime = createTime;
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                ", i=" + i +
                '}';
    }
}
