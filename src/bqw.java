// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

final class bqw
    implements android.content.DialogInterface.OnShowListener
{

    final bqv a;

    bqw(bqv bqv)
    {
        a = bqv;
        super();
    }

    public void onShow(DialogInterface dialoginterface)
    {
        dialoginterface = (AlertDialog)dialoginterface;
        if (dialoginterface != null)
        {
            Button button = dialoginterface.getButton(-1);
            if (button != null)
            {
                button.setAllCaps(true);
            }
            dialoginterface = dialoginterface.getButton(-2);
            if (dialoginterface != null)
            {
                dialoginterface.setAllCaps(true);
                return;
            }
        }
    }
}
