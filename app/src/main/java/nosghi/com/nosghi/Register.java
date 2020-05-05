package nosghi.com.nosghi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Register extends AppCompatActivity {

    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etEmailAddress)
    EditText etEmailAddress;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.bRegister)
    Button bRegister;
    @BindView(R.id.bLogin)
    TextView bLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.bRegister, R.id.bLogin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bRegister:
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                break;
            case R.id.bLogin:
                Intent intent2 = new Intent(getApplicationContext(),Login.class);
                startActivity(intent2);
                break;
        }
    }
}
