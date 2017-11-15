package utad.pdmd_actividad1;

import android.content.Intent;
import android.view.View;

public class ProfileActivityEvents implements View.OnClickListener {

    private ProfileActivity profileActivity;
    private boolean isEditing;

    public ProfileActivityEvents(ProfileActivity profileActivity){
        this.profileActivity = profileActivity;
    }

    @Override
    public void onClick(View view) {
            if (view.getId() == R.id.btnEdit) {
                if(!isEditing) {
                    isEditing = true;
                    profileActivity.txtName.setEnabled(true);
                    profileActivity.txtEmail.setEnabled(true);
                    profileActivity.txtAddr.setEnabled(true);
                    profileActivity.txtPhone.setEnabled(true);
                    profileActivity.btnNext.setText(R.string.btnSave);
                    profileActivity.btnEdit.setText(R.string.btnCancel);
                }else{
                    isEditing = false;
                    profileActivity.txtName.setEnabled(false);
                    profileActivity.txtEmail.setEnabled(false);
                    profileActivity.txtAddr.setEnabled(false);
                    profileActivity.txtPhone.setEnabled(false);
                    profileActivity.txtName.setText("");
                    profileActivity.txtEmail.setText("");
                    profileActivity.txtAddr.setText("");
                    profileActivity.txtPhone.setText("");
                    profileActivity.btnNext.setText(R.string.btnNext);
                    profileActivity.btnEdit.setText(R.string.btnEdit);
                }
            }else if (view.getId() == R.id.btnNext){
                if(!isEditing) {
                    isEditing = true;
                    Intent intent = new Intent(profileActivity, BooksActivity.class);
                    profileActivity.startActivity(intent);
                    profileActivity.finish();
                }else{
                    isEditing = false;
                    profileActivity.txtName.setEnabled(false);
                    profileActivity.txtEmail.setEnabled(false);
                    profileActivity.txtPhone.setEnabled(false);
                    profileActivity.txtAddr.setEnabled(false);
                    profileActivity.btnNext.setText(R.string.btnNext);
                    profileActivity.btnEdit.setText(R.string.btnEdit);

                    DataHolder.Instance.name = profileActivity.txtName.getText().toString();
                    DataHolder.Instance.email = profileActivity.txtEmail.getText().toString();
                    DataHolder.Instance.addr = profileActivity.txtAddr.getText().toString();
                    DataHolder.Instance.phone = profileActivity.txtPhone.getText().toString();
                    DataHolder.Instance.yy = profileActivity.regDate.getYear();
                    DataHolder.Instance.mm = profileActivity.regDate.getMonth();
                    DataHolder.Instance.dd = profileActivity.regDate.getDayOfMonth();
                }

            }


    }

}
