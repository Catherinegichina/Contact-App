package com.example.contactslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class contacts_list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts_list)
        Contacts()
    }
    fun Contacts(){
//        fun displayContacts()yake
        var rvcontacts=findViewById<RecyclerView>(R.id.rvcontacts)

//        for the recycler view
        var contactsList= listOf(
//           var myContacts=listOf
            contacts("John","john@gmail","07123","https://www.google.com/imgres?imgurl=https%3A%2F%2Fpbs.twimg.com%2Fmedia%2FCCZ12lbWgAAg-Ov.png&imgrefurl=https%3A%2F%2Ftwitter.com%2Fbuzzfeeders%2Fstatus%2F587286383145934848&tbnid=A5POpOyR9uDWRM&vet=12ahUKEwiXyv3W07DxAhVN4oUKHTmACmsQMygGegUIARCtAQ..i&docid=AsZcDA_yY-8z1M&w=373&h=376&q=hunk%20animation&ved=2ahUKEwiXyv3W07DxAhVN4oUKHTmACmsQMygGegUIARCtAQ"),
            contacts("Joy","joy@gmail","07456","https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.animationmagazine.net%2Fwordpress%2Fwp-content%2Fuploads%2Fspongebob-squarepants-2.jpg&imgrefurl=https%3A%2F%2Fwww.animationmagazine.net%2Ftv%2Fspongebob-spin-off-kamp-koral-greenlit-for-13-episodes%2F&tbnid=ZiIfaXtgBw8EJM&vet=12ahUKEwj3qbuj1LDxAhUW_RoKHZxNCesQMygAegUIARDMAQ..i&docid=MF5vdaZoks9qjM&w=1000&h=600&q=spongebob%20animation&ved=2ahUKEwj3qbuj1LDxAhUW_RoKHZxNCesQMygAegUIARDMAQ"),
            contacts("Joe","joe@gmail","07789","https://www.google.com/imgres?imgurl=https%3A%2F%2Fvariety.com%2Fwp-content%2Fuploads%2F2015%2F03%2Fhome-dreamworks-animation.jpg%3Fw%3D681%26h%3D383%26crop%3D1&imgrefurl=https%3A%2F%2Fvariety.com%2F2015%2Ffilm%2Freviews%2Ffilm-review-home-1201448174%2F&tbnid=xNgA0rNuX-4piM&vet=12ahUKEwiH-4S31LDxAhU8gM4BHfIqBpQQMygGegUIARDaAQ..i&docid=G2c5eQs72c_x6M&w=681&h=383&q=home%20animation&ved=2ahUKEwiH-4S31LDxAhU8gM4BHfIqBpQQMygGegUIARDaAQ"),
            contacts("Jim","jim@gmail","07333","https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.awn.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Foriginal%2Fpublic%2Fimage%2Fattached%2F1030354-2426fpf00264r-1200.jpg%3Fitok%3DtsapQGDV&imgrefurl=https%3A%2F%2Fwww.awn.com%2Fanimationworld%2Fchris-renaud-talks-secret-life-pets&tbnid=Eyppc3IcfPZ1sM&vet=12ahUKEwjy0N_F1LDxAhVPQRoKHXbKBjMQMygAegUIARDDAQ..i&docid=CBzwh6_XoIT2yM&w=1200&h=647&q=pets%20animation&ved=2ahUKEwjy0N_F1LDxAhVPQRoKHXbKBjMQMygAegUIARDDAQ"),
            contacts("Jam","jam@gmail","07999","https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.awn.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2Foriginal%2Fpublic%2Fimage%2Fattached%2F1053253-10e34sq1025s23f2124kfinalcmyk-1280.jpg%3Fitok%3DQfIX7T-5&imgrefurl=https%3A%2F%2Fwww.awn.com%2Fanimationworld%2Funpacking-croods-new-age-character-animation&tbnid=qWMY4Sc0PYCqNM&vet=12ahUKEwjWmcrT1LDxAhVbgM4BHRFJCcUQMygDegUIARC2AQ..i&docid=7WeX69aHNImZgM&w=1280&h=531&q=croods%20animation&ved=2ahUKEwjWmcrT1LDxAhVbgM4BHRFJCcUQMygDegUIARC2AQ")
        )
        var contactsadapter=contactsadapter(contactsList,baseContext)
        rvcontacts.layoutManager=LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsadapter
    }

}
//All this can happen in activity main.