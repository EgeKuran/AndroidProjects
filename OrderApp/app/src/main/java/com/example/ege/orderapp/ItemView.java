package com.example.ege.orderapp;

import android.content.Context;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class ItemView extends LinearLayout {

    interface ItemViewListener {
        void exitClicked();

    }
    ItemViewListener listener;
    Button btnExit;
    Button btnAddItem;

    public EditText getEditText() {
        return editText;
    }

    EditText editText;

    public Spinner getSpnItem() {
        return spnItem;
    }

    Spinner spnItem;
    public ItemView(Context context) {

        super(context);

        inflate(context, R.layout.itemviewlayout, this);
        spnItem=findViewById(R.id.spnitem);
        btnExit = findViewById(R.id.btnexit);
        btnAddItem = findViewById(R.id.btnadd);
        editText = findViewById(R.id.txtitemqty);
        btnExit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.exitClicked();
            }
        });

    }
    public void setListener(ItemViewListener listener) {
        this.listener = listener;
    }
}
