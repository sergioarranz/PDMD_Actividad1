package utad.pdmd_actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BooksActivity extends AppCompatActivity {

    private BooksActivityEvents events;
    public Button btnProfile, btnPrev, btnBNext;
    public TextView lblTitle, lblText;
    public EditText txtTitle, txtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        events = new BooksActivityEvents(this);

        // Buttons
        btnProfile = this.findViewById(R.id.btnProfile);
        btnPrev = this.findViewById(R.id.btnPrev);
        btnBNext = this.findViewById(R.id.btnBNext);

        btnProfile.setText(R.string.btnProfile);
        btnPrev.setText(R.string.btnPrev);
        btnBNext.setText(R.string.btnBNext);


        // Labels
        lblTitle = this.findViewById(R.id.lblTitle);
        lblText = this.findViewById(R.id.lblText);

        lblTitle.setText(R.string.lblTitle);
        lblText.setText(R.string.lblText);

        // EditTexts

        txtTitle = this.findViewById(R.id.txtTitle);
        txtText = this.findViewById(R.id.txtText);
    }
}
