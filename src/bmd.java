// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;

final class bmd
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final bmb b;

    bmd(bmb bmb1, EditText edittext)
    {
        b = bmb1;
        a = edittext;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((ConversationParticipantsFragment)b.getTargetFragment()).a(a.getText().toString().trim());
    }
}
