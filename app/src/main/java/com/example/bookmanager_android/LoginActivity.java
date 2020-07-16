package com.example.bookmanager_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity{
        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // activity_login.xml ファイルをレイアウトとして登録し表示する設定
            setContentView(R.layout.activity_login);

            // ボタン設定
            // レイアウトファイルからid が btnSignUp のものを見つけてくることを意味
            Button signUp = (Button) findViewById(R.id.btnSignUp);

            // ボタンクリックイベントの通信先の指定
            signUp.setOnClickListener(new View.OnClickListener() {
                // オーバーライドが成立していない時に警告してくれるアノテーション
                @Override
                // ボタンクリック時に呼ばれる
                public void onClick(View view) {
                    // アプリ内のアクティビティを呼び出すインテントの生成
                    Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(intent);
                }
            });
        }


}
