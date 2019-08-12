package com.metro.help.tabactivity;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import android.widget.LinearLayout;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    private EditText editText;
    private EditText fiftythinputj;
    private TextView fiftythresj;

    private EditText tenthinputj;
    private TextView tenthresj;

    private EditText fivethinputj;
    private TextView fivethresj;

    private EditText onethinputj;
    private TextView onethresj;

    private EditText fivehuninputj;
    private TextView fivehunresj;

    private EditText onehuninputj;
    private TextView onehunresj;

    private EditText fiftyinputj;
    private TextView fiftyresj;

    private EditText teninputj;
    private TextView tenresj;

    private EditText onecardinputj;
    private TextView onecardresj;

    private EditText passinputj;
    private TextView passresj;

    private EditText tmoneyinputj;
    private TextView tmoneyresj;

    private EditText travelpassinputj;
    private TextView travelpassresj;

    private EditText tworefundinputj;
    private TextView tworefundresj;

    private EditText refundinputj;
    private TextView refundresj;

    private TextView sumj;

    private int t1;

    private InputMethodManager ipm;

    private LinearLayout lin2j;
    InputMethodManager imm;

    public static FirstFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FirstFragment blankFragment = new FirstFragment();
        blankFragment.setArguments(args);

        return blankFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first, container, false);


        fiftythinputj = (EditText) rootView.findViewById(R.id.fiftythinput);
        fiftythresj = (TextView) rootView.findViewById(R.id.fiftythres);
        fiftythinputj.addTextChangedListener(textWatcher);

        tenthinputj = (EditText) rootView.findViewById(R.id.tenthinput);
        tenthresj = (TextView) rootView.findViewById(R.id.tenthres);
        tenthinputj.addTextChangedListener(textWatcher);

        fivethinputj = (EditText) rootView.findViewById(R.id.fivethinput);
        fivethresj = (TextView) rootView.findViewById(R.id.fivethres);
        fivethinputj.addTextChangedListener(textWatcher);

        onethinputj = (EditText) rootView.findViewById(R.id.onethinput);
        onethresj = (TextView) rootView.findViewById(R.id.onethres);
        onethinputj.addTextChangedListener(textWatcher);

        fivehuninputj = (EditText) rootView.findViewById(R.id.fivehuninput);
        fivehunresj = (TextView) rootView.findViewById(R.id.fivehunres);
        fivehuninputj.addTextChangedListener(textWatcher);

        onehuninputj = (EditText) rootView.findViewById(R.id.onehuninput);
        onehunresj = (TextView) rootView.findViewById(R.id.onehunres);
        onehuninputj.addTextChangedListener(textWatcher);

        fiftyinputj = (EditText) rootView.findViewById(R.id.fiftyinput);
        fiftyresj = (TextView) rootView.findViewById(R.id.fiftyres);
        fiftyinputj.addTextChangedListener(textWatcher);

        teninputj = (EditText) rootView.findViewById(R.id.teninput);
        tenresj = (TextView) rootView.findViewById(R.id.tenres);
        teninputj.addTextChangedListener(textWatcher);

        onecardinputj = (EditText) rootView.findViewById(R.id.onecardinput);
        onecardresj = (TextView) rootView.findViewById(R.id.onecardres);
        onecardinputj.addTextChangedListener(textWatcher);

        passinputj = (EditText) rootView.findViewById(R.id.passinput);
        passresj = (TextView) rootView.findViewById(R.id.passres);
        passinputj.addTextChangedListener(textWatcher);

        tmoneyinputj = (EditText) rootView.findViewById(R.id.tmoneyinput);
        tmoneyresj = (TextView) rootView.findViewById(R.id.tmoneyres);
        tmoneyinputj.addTextChangedListener(textWatcher);

        travelpassinputj = (EditText) rootView.findViewById(R.id.travelpassinput);
        travelpassresj = (TextView) rootView.findViewById(R.id.travelpassres);
        travelpassinputj.addTextChangedListener(textWatcher);

        tworefundinputj = (EditText) rootView.findViewById(R.id.tworefundinput);
        tworefundresj = (TextView) rootView.findViewById(R.id.tworefundres);
        tworefundinputj.addTextChangedListener(textWatcher);

        refundinputj = (EditText) rootView.findViewById(R.id.refundinput);
        refundresj = (TextView) rootView.findViewById(R.id.refundres);
        refundinputj.addTextChangedListener(textWatcher);

        sumj = (TextView) rootView.findViewById(R.id.sum);

        lin2j = (LinearLayout) rootView.findViewById(R.id.lin2);


//        lin2j.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                imm=(InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//                Log.v("tag","1");
//                imm.hideSoftInputFromWindow(fiftythinputj.getWindowToken(), 0);
//                Log.v("tag","2");
//            }
//        });

        lin2j.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                imm=(InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                Log.v("tag","1");
                imm.hideSoftInputFromWindow(fiftythinputj.getWindowToken(), 0);
                Log.v("tag","2");
                return false;
            }
        });



        return rootView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);



    }





    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            int fiftythinputjj = TextUtils.isEmpty(fiftythinputj.getText().toString()) ? 0 : Integer.parseInt(fiftythinputj.getText().toString());
            fiftythresj.setText("" + "₩ " + (fiftythinputjj * 50000));
            t1 = fiftythinputjj * 50000;
            sumj.setText("" + "₩ " + (t1));

            int tenthinputjj = TextUtils.isEmpty(tenthinputj.getText().toString()) ? 0 : Integer.parseInt(tenthinputj.getText().toString());
            tenthresj.setText("" + "₩ " + (tenthinputjj * 10000));

            int fivethinputjj = TextUtils.isEmpty(fivethinputj.getText().toString()) ? 0 : Integer.parseInt(fivethinputj.getText().toString());
            fivethresj.setText("" + "₩ " + (fivethinputjj * 5000));

            int onethinputjj = TextUtils.isEmpty(onethinputj.getText().toString()) ? 0 : Integer.parseInt(onethinputj.getText().toString());
            onethresj.setText("" + "₩ " + (onethinputjj * 1000));

            int fivehuninputjj = TextUtils.isEmpty(fivehuninputj.getText().toString()) ? 0 : Integer.parseInt(fivehuninputj.getText().toString());
            fivehunresj.setText("" + "₩ " + (fivehuninputjj * 500));

            int onehuninputjj = TextUtils.isEmpty(onehuninputj.getText().toString()) ? 0 : Integer.parseInt(onehuninputj.getText().toString());
            onehunresj.setText("" + "₩ " + (onehuninputjj * 100));

            int fiftyinputjj = TextUtils.isEmpty(fiftyinputj.getText().toString()) ? 0 : Integer.parseInt(fiftyinputj.getText().toString());
            fiftyresj.setText("" + "₩ " + (fiftyinputjj * 50));

            int teninputjj = TextUtils.isEmpty(teninputj.getText().toString()) ? 0 : Integer.parseInt(teninputj.getText().toString());
            tenresj.setText("" + "₩ " + (teninputjj * 10));

            int onecardinputjj = TextUtils.isEmpty(onecardinputj.getText().toString()) ? 0 : Integer.parseInt(onecardinputj.getText().toString());
            onecardresj.setText("" + "₩ " + (onecardinputjj * 500));

            int passinputjj = TextUtils.isEmpty(passinputj.getText().toString()) ? 0 : Integer.parseInt(passinputj.getText().toString());
            passresj.setText("" + "₩ " + (passinputjj * 2500));

            int tmoneyinputjj = TextUtils.isEmpty(tmoneyinputj.getText().toString()) ? 0 : Integer.parseInt(tmoneyinputj.getText().toString());
            tmoneyresj.setText("" + "₩ " + (tmoneyinputjj * 1));

            int travelpassinputjj = TextUtils.isEmpty(travelpassinputj.getText().toString()) ? 0 : Integer.parseInt(travelpassinputj.getText().toString());
            travelpassresj.setText("" + "₩ " + (travelpassinputjj * 1));

            int tworefundinputjj = TextUtils.isEmpty(tworefundinputj.getText().toString()) ? 0 : Integer.parseInt(tworefundinputj.getText().toString());
            tworefundresj.setText("" + "₩ " + (tworefundinputjj * 1));

            int refundinputjj = TextUtils.isEmpty(refundinputj.getText().toString()) ? 0 : Integer.parseInt(refundinputj.getText().toString());
            refundresj.setText("₩ " + (refundinputjj * 1));

            sumj.setText("" + "₩ " + ((fiftythinputjj * 50000) + (tenthinputjj * 10000) + (fivethinputjj * 5000) + (onethinputjj * 1000) + (fivehuninputjj * 500) + (onehuninputjj * 100) + (fiftyinputjj * 50) + (teninputjj * 10) + (onecardinputjj * 500) + (passinputjj * 2500) + (tmoneyinputjj * 1) + (travelpassinputjj * 1) + (tworefundinputjj * 1) + (refundinputjj * 1)));

        }



        @Override
        public void afterTextChanged(Editable editable) {
        }
    };

}


