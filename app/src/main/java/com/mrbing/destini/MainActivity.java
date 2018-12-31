package com.mrbing.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mSTextView;
    private Button mTButton,mBButton;
    private int mIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mSTextView=(TextView)findViewById(R.id.storyTextView);
        mTButton=(Button)findViewById(R.id.buttonTop);
        mBButton=(Button)findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1||mIndex==2){
                    mIndex=3;
                    mSTextView.setText(R.string.T3_Story);
                    mTButton.setText(R.string.T3_Ans1);
                    mBButton.setText(R.string.T3_Ans2);
                }
                else {
                    mSTextView.setText(R.string.T6_End);
                    mTButton.setVisibility(View.GONE);
                    mBButton.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Rotate phone to Restart",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIndex==1){
                    mIndex=2;
                    mSTextView.setText(R.string.T2_Story);
                    mTButton.setText(R.string.T2_Ans1);
                    mBButton.setText(R.string.T2_Ans2);
                }
                else if (mIndex==2){
                    mSTextView.setText(R.string.T4_End);
                    mTButton.setVisibility(View.GONE);
                    mBButton.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Rotate phone to Restart",Toast.LENGTH_SHORT).show();
                }
                else {
                    mSTextView.setText(R.string.T5_End);
                    mTButton.setVisibility(View.GONE);
                    mBButton.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Rotate phone to Restart",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
