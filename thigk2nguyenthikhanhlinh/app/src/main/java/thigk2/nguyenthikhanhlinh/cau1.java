package thigk2.nguyenthikhanhlinh;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cau1 extends AppCompatActivity {
    EditText edt1, edt2, edtKQ;
    Button btnKT;

    public EditText getEdt1() {
        return edt1;
    }

    public void setEdt1(EditText edt1) {
        this.edt1 = edt1;
    }

    public EditText getEdt2() {
        return edt2;
    }

    public void setEdt2(EditText edt2) {
        this.edt2 = edt2;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edtKQ = findViewById(R.id.edtKQ);
        btnKT = findViewById(R.id.btnKT);

        btnKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b = "4";
                String c="1975";

                if(getEdt1().getText().toString().equals(b) && getEdt2().getText().toString().equals(c)){
                    edtKQ.setText("Đúng rồi");
                }
                else{
                    edtKQ.setText("Sai rồi");
                }
            }
        });
    }
}