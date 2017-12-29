package net.theprogressapp.progressproject9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {

        EditText somethingEditText = (EditText) findViewById(R.id.somethingEditText);

        Toast.makeText(MainActivity.this, "You typed in this word " + somethingEditText.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
