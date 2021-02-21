package model;

import android.widget.EditText;

import java.util.Observable;

public class Model  extends Observable {

    private String data = "Text";

    public String getData() {
        return data;
    }

    public void setData(EditText data) {
        this.data = String.valueOf(data);
        super.setChanged();
        super.notifyObservers();
    }
}
