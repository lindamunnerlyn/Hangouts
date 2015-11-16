// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class azk extends hgi
{

    private azl aj;

    public azk()
    {
    }

    public static void a(boolean flag, Context context, ap ap)
    {
        Bundle bundle = new Bundle();
        int i;
        if (flag)
        {
            i = g.kI;
        } else
        {
            i = g.kH;
        }
        bundle.putString("title", context.getString(i));
        if (flag)
        {
            i = g.kK;
        } else
        {
            i = g.kJ;
        }
        bundle.putString("message", context.getString(i));
        bundle.putString("positive", context.getString(g.kL));
        bundle.putString("negative", context.getString(g.kG));
        context = new azk();
        context.setArguments(bundle);
        context.a(ap, "off_the_record_alert");
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (azl)al.a(azl);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            ebw.e("OffTheRecordAlertDialog", "OTR status changed dialog: User clicked sent.");
            aj.a();
            return;

        case -2: 
            ebw.e("OffTheRecordAlertDialog", "OTR status changed dialog: User clicked cancel.");
            return;
        }
    }
}
