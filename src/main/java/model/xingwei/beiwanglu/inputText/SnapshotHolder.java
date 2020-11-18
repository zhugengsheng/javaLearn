package model.xingwei.beiwanglu.inputText;

import java.io.InputStream;
import java.util.Stack;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:53 下午
 */
public class SnapshotHolder {
    private Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot(){
        return snapshots.pop();
    }

    public void pushSnapshot(InputText inputText){
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }

}
