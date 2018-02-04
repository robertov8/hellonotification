package br.com.livroandroid.hellonotification

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNotificacao.setOnClickListener {
            // Ao clicar na notificação, vai abrir a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            NotificationUtil.create(this, 1, intent, "Livro Android", "Hello Notification")
        }
    }
}
