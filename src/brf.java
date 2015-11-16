// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

final class brf
    implements android.content.DialogInterface.OnShowListener
{

    final bre a;

    brf(bre bre)
    {
        a = bre;
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
