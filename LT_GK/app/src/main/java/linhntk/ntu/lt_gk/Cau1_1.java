package linhntk.ntu.lt_gk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1_1 extends AppCompatActivity {
    EditText edtBanKinh;
    TextView txtKetQua;
    Button btnTinhChuVi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau11);
        edtBanKinh = findViewById(R.id.edtBanKinh);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnTinhChuVi = findViewById(R.id.btnTinhChuVi);

        btnTinhChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhChuVi();
            }
        });
    }

    private void tinhChuVi() {
        String strBanKinh = edtBanKinh.getText().toString();

        if (!strBanKinh.isEmpty()) {
            double R = Double.parseDouble(strBanKinh);
            double chuVi = 2 * Math.PI * R;

            txtKetQua.setText("Chu vi: " + String.format("%.2f", chuVi));
        } else {
            txtKetQua.setText("Vui lòng nhập bán kính!");
        }
    }
}