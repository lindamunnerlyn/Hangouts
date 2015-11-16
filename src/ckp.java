// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ckp
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final BabelHomeActivity b;

    public ckp(BabelHomeActivity babelhomeactivity, EditText edittext)
    {
        b = babelhomeactivity;
        a = edittext;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.getText().toString();
        String s = (String)a.getTag();
        RealTimeChatService.c(BabelHomeActivity.p(b), s, dialoginterface);
    }
}
