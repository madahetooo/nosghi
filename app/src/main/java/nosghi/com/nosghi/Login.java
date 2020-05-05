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
import nosghi.com.nosghi.ui.MainActivity;

public class Login extends AppCompatActivity {

    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etEmailAddress)
    EditText etEmailAddress;
    @BindView(R.id.bRegister)
    Button bRegister;
    @BindView(R.id.txRegister)
    TextView txRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }

    @OnClick({R.id.bRegister, R.id.txRegister})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bRegister:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            case R.id.txRegister:
                Intent intent2 = new Intent(getApplicationContext(), Register.class);
                startActivity(intent2);
                break;
        }
    }
}

