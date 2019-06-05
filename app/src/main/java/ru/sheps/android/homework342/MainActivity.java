package ru.sheps.android.homework342;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
    }

    public void btnOk(View view) {
        Locale locale;
        Spinner spinner = findViewById(R.id.spinnerForLanguage);
        int position = spinner.getSelectedItemPosition();
        if (position == 1) {
            locale = new Locale("ru");
        } else {
            locale = new Locale("eng");
        }

        Spinner colorSinner = findViewById(R.id.spinnerForColor);
        Utils.changeToTheme(this, colorSinner.getSelectedItemPosition());

        Configuration config = new Configuration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        recreate();

    }

}
