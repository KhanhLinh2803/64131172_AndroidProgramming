package linhntk.ntu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1, editTextSo2, editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //gan bo lang nghe cho tung nut
        
    }
    void TimDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetQua);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }
    // Kiểm tra xem EditText có rỗng không
    private boolean kiemTraNhap() {
        if (editTextSo1.getText().toString().trim().isEmpty() || editTextSo2.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập cả hai số!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void XuLyCong(View v) {
        if (!kiemTraNhap()) return;
        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());
        editTextKQ.setText(String.valueOf(soA + soB));
    }

    public void XuLyTru(View v) {
        if (!kiemTraNhap()) return;
        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());
        editTextKQ.setText(String.valueOf(soA - soB));
    }

    public void XuLyNhan(View v) {
        if (!kiemTraNhap()) return;
        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());
        editTextKQ.setText(String.valueOf(soA * soB));
    }

    public void XuLyChia(View v) {
        if (!kiemTraNhap()) return;
        float soA = Float.parseFloat(editTextSo1.getText().toString());
        float soB = Float.parseFloat(editTextSo2.getText().toString());
        if (soB == 0) {
            Toast.makeText(this, "Không thể chia cho 0!", Toast.LENGTH_SHORT).show();
            return;
        }
        editTextKQ.setText(String.valueOf(soA / soB));
    }
}