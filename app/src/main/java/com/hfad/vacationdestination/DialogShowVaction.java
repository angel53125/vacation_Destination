package com.hfad.vacationdestination;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogShowVaction extends DialogFragment{
    private VacationDestiation vd;

    public DialogShowVaction(VacationDestiation vaction)
    {
        vd = vaction;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        LayoutInflater inflator = getActivity().getLayoutInflater();
        View dialogView = inflator.inflate(R.layout.dialog_show_vacation,null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());


        TextView tvTitle = dialogView.findViewById(R.id.tvTitle);
        RadioButton rbFave = dialogView.findViewById(R.id.tvFavorite);
        RadioButton rbNotFave = dialogView.findViewById(R.id.tvNotFavorite);
        Button btnDone = dialogView.findViewById(R.id.btnDoneShowingVacation);

        if(vd.getFave() == true)
        {
            rbFave.setChecked(true);
            rbNotFave.setChecked(false);
        }
        else {
            rbNotFave.setChecked(true);
            rbFave.setChecked(false);

        }




        tvTitle.setText(vd.getPlaceName());
       // tvStatus.setText(note.getStatus());
       // tvDescription.setText(note.getDescription());

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

      builder.setView(dialogView);

        return builder.create();
    }
}
