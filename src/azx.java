// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class azx extends hla
{

    private baa aj;

    public azx()
    {
    }

    public static void a(Context context, ap ap)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(g.kA));
        bundle.putString("message", context.getString(g.kB));
        bundle.putString("positive", context.getString(g.kC));
        bundle.putString("negative", context.getString(g.kz));
        context = new azx();
        context.setArguments(bundle);
        context.a(ap, "off_the_record_alert");
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (baa)al.a(baa);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            eev.e("OffTheRecordAlertDialog", "OTR status changed dialog: User clicked sent.");
            aj.a();
            return;

        case -2: 
            eev.e("OffTheRecordAlertDialog", "OTR status changed dialog: User clicked cancel.");
            return;
        }
    }
}
