package utad.pdmd_actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sergio on 15/11/17.
 */

public class BooksActivity extends AppCompatActivity {


    public Button btnProfile, btnPrev, btnBNext;
    public TextView lblTitle, lblText;
    public EditText txtTitle, txtText;
    public String[] TitlesArray, TextsArray;
    private BooksActivityEvents events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        events = new BooksActivityEvents(this);

        // Arrays
        TitlesArray = getResources().getStringArray(R.array.titles);
        TextsArray = getResources().getStringArray(R.array.texts);

        // Buttons
        btnProfile = this.findViewById(R.id.btnProfile);
        btnPrev = this.findViewById(R.id.btnPrev);
        btnPrev.setEnabled(false);
        btnBNext = this.findViewById(R.id.btnBNext);

        btnProfile.setText(R.string.btnProfile);
        btnPrev.setText(R.string.btnPrev);
        btnBNext.setText(R.string.btnBNext);

        // TextViews
        lblTitle = this.findViewById(R.id.lblTitle);
        lblText = this.findViewById(R.id.lblText);

        lblTitle.setText(R.string.lblTitle);
        lblText.setText(R.string.lblText);

        // EditTexts
        txtTitle = this.findViewById(R.id.txtTitle);
        txtText = this.findViewById(R.id.txtText);

        txtTitle.setText(TitlesArray[0]);
        txtText.setText(TextsArray[0]);

        // Listeners
        btnProfile.setOnClickListener(events);
        btnPrev.setOnClickListener(events);
        btnBNext.setOnClickListener(events);



    }
}
