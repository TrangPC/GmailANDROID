package com.example.mail

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inboxListView: ListView = findViewById(R.id.inboxListView)
        val inboxItems = mutableListOf(
            InboxItem(R.drawable.avt1, "nguyen", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt2, "thu", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt3, "trang", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt4, "nguyen1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt5, "thu1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt6, "trang1", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt7, "nguyen2", "Nội dung tin nhắn mặc định"),
            InboxItem(R.drawable.avt8, "thu", "Nội dung tin nhắn mặc định")
        )

        val customAdapter = CustomAdapter(this, R.layout.list_item_inbox, inboxItems)
        inboxListView.adapter = customAdapter
    }

}
