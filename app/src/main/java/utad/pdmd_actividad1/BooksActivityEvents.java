package utad.pdmd_actividad1;

import android.content.Intent;
import android.view.View;

public class BooksActivityEvents implements View.OnClickListener {

    private BooksActivity booksActivity;
    private int aux; // Index aux var for Arrays

    public BooksActivityEvents(BooksActivity booksActivity){
        this.booksActivity = booksActivity;
        aux=0;
    }

    @Override
    public void onClick(View view) {

        // Profile Button
        if (view.getId() == R.id.btnProfile){
            Intent intent = new Intent(booksActivity, ProfileActivity.class);
            booksActivity.startActivity(intent);
            booksActivity.finish();
        }
        // Next Button
        else if (view.getId() == R.id.btnBNext){
            // Check prev button enabled for a real UX pagination
            if(!booksActivity.btnPrev.isEnabled()){
                booksActivity.btnPrev.setEnabled(true);
            }
            if (aux < booksActivity.TitlesArray.length-1 || aux < booksActivity.TextsArray.length-1){
                aux++;
                booksActivity.txtTitle.setText(booksActivity.TitlesArray[aux]);
                booksActivity.txtText.setText(booksActivity.TextsArray[aux]);
                if (aux == booksActivity.TitlesArray.length-1 || aux == booksActivity.TextsArray.length-1) {
                    booksActivity.btnBNext.setEnabled(false);
                }
            }
        } else if (view.getId() == R.id.btnPrev){
            if(!booksActivity.btnBNext.isEnabled()){
                booksActivity.btnBNext.setEnabled(true);
            }
            if( aux>0 && aux < booksActivity.TitlesArray.length || aux < booksActivity.TextsArray.length){
                aux--;
                booksActivity.txtTitle.setText(booksActivity.TitlesArray[aux]);
                booksActivity.txtText.setText(booksActivity.TextsArray[aux]);
                if (aux == 0) {
                    booksActivity.btnPrev.setEnabled(false);
                }
            }
        }
    }
}
