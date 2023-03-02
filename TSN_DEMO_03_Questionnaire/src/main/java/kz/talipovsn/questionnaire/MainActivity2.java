package kz.talipovsn.questionnaire;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onBack(View v) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
        setResult(RESULT_OK);
        finish();
    }


    //Кнопка переход
    public void onExit(View v) {
        finishAffinity();
    }

}

