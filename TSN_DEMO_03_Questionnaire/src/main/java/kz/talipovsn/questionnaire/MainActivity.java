package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Локальные переменные для доступа к компонентам окна
    private EditText editText;
    private CheckBox checkBox;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация переменных доступа к компонентам окна
        editText =   findViewById(R.id.editText);
        checkBox =   findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
    }

    // МЕТОД ДЛЯ КНОПКИ "ИТОГО"
    public void onInfo(View v) {
        // Создание второго окна
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        //Intent intent = new Intent("kz.talipovsn.questionnaire.ResultActivity");

        RadioButton selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        // Подготовка параметров для второго окна
        intent.putExtra("model", editText.getText().toString());
        intent.putExtra("gender", checkBox.isChecked() ? getString(R.string.Мужчина) : getString(R.string.Женщина));
        intent.putExtra("color", selectRadioButton.getText());

        // Запуск второго окна
        startActivity(intent);
    }

}