package model.xingwei.beiwanglu.inputText;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:46 下午
 */
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String str){
        text.append(str);
    }

    public void setText(String text){
        this.text.replace(0, this.text.length(), text);
    }
}
