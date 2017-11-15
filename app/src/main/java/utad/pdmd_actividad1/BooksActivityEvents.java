package utad.pdmd_actividad1;

import android.content.Intent;
import android.view.View;

public class BooksActivityEvents implements View.OnClickListener {

    private BooksActivity booksActivity;

    public BooksActivityEvents(BooksActivity booksActivity){
        this.booksActivity = booksActivity;
    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btnProfile){
            Intent intent = new Intent(booksActivity, ProfileActivity.class);
            booksActivity.startActivity(intent);
            booksActivity.finish();
        }
    }
}
