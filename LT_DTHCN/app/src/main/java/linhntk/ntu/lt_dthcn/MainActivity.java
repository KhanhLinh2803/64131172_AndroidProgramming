package linhntk.ntu.lt_dthcn;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XulyNhan(View view){
        EditText editTextChieudai = findViewById(R.id.editCD);
        EditText editTextChieurong = findViewById(R.id.editCD);
        EditText editTextKetqua = findViewById(R.id.editTextNumber);
        String CD = editTextChieudai.getText().toString();
        String CR = editTextChieurong.getText().toString();
        int c_dai = Integer.parseInt(CD);
        int c_rong = Integer.parseInt(CR);
        int dientich = c_dai * c_rong;
        String DT = String.valueOf(dientich);
        editTextKetqua.setText(DT);
    }
}