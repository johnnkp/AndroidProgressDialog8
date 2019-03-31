package hkcc.ccn3140.progressdialog8;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button portProgressDialog = findViewById(R.id.portprogressdialog);
        portProgressDialog.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ProgressDialog(MainActivity.this).show();
            }
        });

        Button createProgressDialog = findViewById(R.id.createprogressdialog);
        createProgressDialog.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // http://nickcode4fun.net/2018/01/18/MaterialDesign-Android-Dialogs/
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Progress Dialog")
                        .setView(R.layout.progress_dialog)
                        .create()
                        .show();
            }
        });
    }
}
