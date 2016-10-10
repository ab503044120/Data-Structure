package com.huihui.binarytree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvContent;
    private BinaryTree mBinaryTree;
    private Button btnPreNon;
    private Button btnMidNon;
    private Button btnPostNon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContent = (TextView) findViewById(R.id.tv_content);
        btnPreNon = (Button) findViewById(R.id.btn_pre_non);
        btnMidNon = (Button) findViewById(R.id.btn_mid_non);
        btnPostNon = (Button) findViewById(R.id.btn_post_non);
        btnPreNon.setOnClickListener(this);
        btnMidNon.setOnClickListener(this);
        btnPostNon.setOnClickListener(this);
        mBinaryTree = new BinaryTree();
        mBinaryTree.createBinaryTree();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pre_non:
                tvContent.setText(mBinaryTree.nonRecPreOrder());
                break;
            case R.id.btn_mid_non:
                tvContent.setText(mBinaryTree.nonRecMidOrder());
                break;
            case R.id.btn_post_non:
                tvContent.setText(mBinaryTree.nonRecPostOrder());
                break;

        }
    }
}
