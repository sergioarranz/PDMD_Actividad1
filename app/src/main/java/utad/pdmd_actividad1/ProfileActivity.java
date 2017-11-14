package utad.pdmd_actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    public Button btnNext, btnEdit;
    public TextView lblName, lblEmail, lblPhone, lblAddr, lblRegDate;
    public EditText txtName, txtEmail, txtPhone, txtAddr;
    public DatePicker regDate;
    private ProfileActivityEvents events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        events = new ProfileActivityEvents(this);

        // Buttons
        btnNext = this.findViewById(R.id.btnNext);
        btnEdit = this.findViewById(R.id.btnEdit);

        btnNext.setText(R.string.btnNext);
        btnEdit.setText(R.string.btnEdit);

        // Labels
        lblName = this.findViewById(R.id.lblName);
        lblEmail = this.findViewById(R.id.lblEmail);
        lblPhone = this.findViewById(R.id.lblPhone);
        lblAddr = this.findViewById(R.id.lblAddr);
        lblRegDate = this.findViewById(R.id.lblRegDate);

        lblName.setText(R.string.lblName);
        lblEmail.setText(R.string.lblEmail);
        lblPhone.setText(R.string.lblPhone);
        lblAddr.setText(R.string.lblAddr);
        lblRegDate.setText(R.string.lblRegDate);

        // EditTexts & DatePicker
        txtName = this.findViewById(R.id.txtName);
        txtEmail = this.findViewById(R.id.txtEmail);
        txtAddr = this.findViewById(R.id.txtAddr);
        txtPhone = this.findViewById(R.id.txtPhone);
        regDate = this.findViewById(R.id.regDate);

        txtName.setText(DataHolder.Instance.name);
        txtEmail.setText(DataHolder.Instance.email);
        txtPhone.setText(DataHolder.Instance.phone);
        txtAddr.setText(DataHolder.Instance.addr);
        regDate.updateDate(DataHolder.Instance.yy, DataHolder.Instance.mm, DataHolder.Instance.dd);


        // Listeners
        btnNext.setOnClickListener(events);
        btnEdit.setOnClickListener(events);
    }
}
