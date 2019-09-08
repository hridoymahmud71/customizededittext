package hridoy.aiz.customizededittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etFirstName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] names = {"James","Johny","Jaime","Jennifer","Julia"};
        ArrayAdapter <String> adp = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, names);

        etFirstName = (AutoCompleteTextView) findViewById(R.id.etFirstName);

        etFirstName.setThreshold(1);
        etFirstName.setAdapter(adp);
    }
}
