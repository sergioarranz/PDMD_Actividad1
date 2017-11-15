package utad.pdmd_actividad1;

import android.view.View;

/**
 * Created by sergio on 15/11/17.
 */

public class BooksActivityEvents implements View.OnClickListener {

    private BooksActivity booksActivity;

    public BooksActivityEvents(BooksActivity booksActivity){
        this.booksActivity = booksActivity;
    }
    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.bt)
    }
}
