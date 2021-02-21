package view;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.appprojekt.R;
import model.Model;

public class AndroidView extends AppCompatActivity {
    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd;
        final TextView textDisplay;
        final EditText textInput;

        btnAdd = findViewById(R.id.btnAdd);
        textDisplay = findViewById(R.id.textDisplay);
        textInput = findViewById(R.id.textinput);
        textInput.setText(model.getData());

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplay.setText(textInput.getText());
                model.setData(textInput);
                textDisplay.setText(model.getData());
            }
        });
    }
}