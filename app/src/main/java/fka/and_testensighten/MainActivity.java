package fka.and_testensighten;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //on instance ensighten ici
        //com.ensighten.Ensighten.bootstrap(this, "fifty-five","AND_TestEnsighten");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Déclaration des 2 bouton
        final Button toastButton = (Button) findViewById(R.id.toastButton);
        final Button injectionButton = (Button) findViewById(R.id.injectionButton);

        //listener toastButton
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(getApplicationContext(), "Hi man !", Toast.LENGTH_LONG).show();
            }
        });
    }
}
