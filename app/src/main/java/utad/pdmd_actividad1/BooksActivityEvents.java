package utad.pdmd_actividad1;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class BooksActivityEvents implements View.OnClickListener {

    private BooksActivity booksActivity;
    private int aux = 0;

    public BooksActivityEvents(BooksActivity booksActivity){
        this.booksActivity = booksActivity;

    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnProfile){
            Intent intent = new Intent(booksActivity, ProfileActivity.class);
            booksActivity.startActivity(intent);
            booksActivity.finish();
        } else if (view.getId() == R.id.btnBNext){
            if ( aux>=0 && aux < booksActivity.TitlesArray.length-1){
                aux++;
                booksActivity.txtTitle.setText(booksActivity.TitlesArray[aux]);
            } else {
                booksActivity.btnBNext.setEnabled(false);
            }
        } else if (view.getId() == R.id.btnPrev){
            if( aux>0 && aux < booksActivity.TitlesArray.length-1){
                aux--;
                booksActivity.txtTitle.setText(booksActivity.TitlesArray[aux]);

            } else {
                booksActivity.btnPrev.setEnabled(false);
            }
        }
    }
}
