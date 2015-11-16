// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ejq extends ac
{

    private Dialog aj;
    private android.content.DialogInterface.OnCancelListener ak;

    public ejq()
    {
        aj = null;
        ak = null;
    }

    public static ejq a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ejq ejq1 = new ejq();
        dialog = (Dialog)h.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        ejq1.aj = dialog;
        if (oncancellistener != null)
        {
            ejq1.ak = oncancellistener;
        }
        return ejq1;
    }

    public Dialog a(Bundle bundle)
    {
        if (aj == null)
        {
            f();
        }
        return aj;
    }

    public void a(ap ap, String s)
    {
        super.a(ap, s);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (ak != null)
        {
            ak.onCancel(dialoginterface);
        }
    }
}
