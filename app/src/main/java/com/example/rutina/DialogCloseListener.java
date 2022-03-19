package com.example.rutina;

import android.content.DialogInterface;
import android.widget.DatePicker;

public interface DialogCloseListener {
    void onDateSet(DatePicker datePicker, int year, int month, int day);

    public void handleDialogClose(DialogInterface dialog);
}
