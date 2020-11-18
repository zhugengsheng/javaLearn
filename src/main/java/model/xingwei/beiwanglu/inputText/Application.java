package model.xingwei.beiwanglu.inputText;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author zhugengsheng
 * @Date 2020/11/13 8:50 下午
 */
public class Application {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            if (":list".equals(input)){
                System.out.println(inputText.getText());
            }else if (":undo".equals(input)){
                InputText snapshot = snapshotHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else{
                snapshotHolder.pushSnapshot(inputText);
                inputText.append(input);
            }


        }
    }

}
