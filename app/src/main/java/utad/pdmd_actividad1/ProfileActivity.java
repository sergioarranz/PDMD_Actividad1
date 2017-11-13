package utad.pdmd_actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    public Button btnNext, btnEdit;
    public LinearLayout gridProfile, gridBtns, gridName, gridEmail, gridPhone, gridAddr, gridRegDate;
    public TextView lblName, lblEmail, lblPhone, lblAddr, lblRegDate;
    public EditText txtName, txtEmail, txtPhone, txtAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // LinearLayouts
        gridProfile = (LinearLayout) this.findViewById(R.id.gridProfile);
        gridBtns = (LinearLayout) this.findViewById(R.id.gridBtns);
        gridName = (LinearLayout) this.findViewById(R.id.gridName);
        gridEmail = (LinearLayout) this.findViewById(R.id.gridEmail);
        gridPhone = (LinearLayout) this.findViewById(R.id.gridPhone);
        gridAddr = (LinearLayout) this.findViewById(R.id.gridAddr);
        gridRegDate = (LinearLayout) this.findViewById(R.id.gridRegDate);

        // Buttons
        btnNext = this.findViewById(R.id.btnNext);
        btnNext.setText(R.string.btnNext);

        btnEdit = this.findViewById(R.id.btnEdit);
        btnEdit.setText(R.string.btnEdit);

        // Labels
        lblName = this.findViewById(R.id.lblName);
        lblName.setText(R.string.lblName);
        lblEmail = this.findViewById(R.id.lblEmail);
        lblEmail.setText(R.string.lblEmail);
        lblPhone = this.findViewById(R.id.lblPhone);
        lblPhone.setText(R.string.lblPhone);
        lblAddr = this.findViewById(R.id.lblAddr);
        lblAddr.setText(R.string.lblAddr);
        lblRegDate = this.findViewById(R.id.lblRegDate);
        lblRegDate.setText(R.string.lblRegDate);

    }
}
