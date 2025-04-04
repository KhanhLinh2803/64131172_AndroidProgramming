package linhntk.ntu.lt_gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1 extends AppCompatActivity {
    ImageView imgHome;
    TextView txtA, txtB, txtKQ;
    EditText edtA, edtB, edtKQ;
    Button btnTong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        imgHome = findViewById(R.id.imgHome);
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtKQ = findViewById(R.id.txtKQ);
        btnTong = findViewById(R.id.btnTong);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(Cau1.this, MainActivity.class);
                startActivity(img);
            }
        });
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = edtA.getText().toString().trim();
                String strB = edtB.getText().toString().trim();
                if (strA.isEmpty() || strB.isEmpty()) {
                    Toast.makeText(Cau1.this, "Vui lòng nhập đầy đủ số!", Toast.LENGTH_SHORT).show();
                    return;
                }
                try {
                    double a = Integer.parseInt(strA);
                    double b = Integer.parseInt(strB);
                    double tong = (a + b)/2;

                    edtKQ.setText(String.valueOf(tong));
                } catch (NumberFormatException e) {
                    Toast.makeText(Cau1.this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}