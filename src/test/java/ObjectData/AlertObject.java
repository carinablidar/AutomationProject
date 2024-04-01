package ObjectData;

import java.util.Map;

public class AlertObject {
    private String text;

    public AlertObject(Map<String, String> testData) {
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "text":
                    setText(testData.get(key));
                    break;
            }
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
