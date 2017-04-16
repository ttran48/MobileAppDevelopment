/* Identifies this class as belonging to the cortana package */
package com.example.tomtran.cortana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/* MainActivity is a subclass of AppCompatAcitvity */
public class MainActivity extends AppCompatActivity {

    @Override /* this annotation tells the compiler that the
    following method is to be used in place of the super class's method of the same name */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* this code tells the activity to use the activity_main.xml files as the layout */
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }
    private void initDisplayButton() {
        Button displayButton = (Button) findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editName = (EditText) findViewById(R.id.editTextName);
                TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                textDisplay.setText("Hello " + nameToDisplay);
            }
        });
    }
}

