// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class bzf extends hgi
{

    private bzg aj;

    public bzf()
    {
    }

    public static void a(Context context, ap ap)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(l.hN));
        bundle.putString("message", context.getString(l.hL));
        bundle.putString("positive", context.getString(l.hM));
        context = new bzf();
        context.setArguments(bundle);
        context.a(ap, "archive_tos");
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (bzg)al.a(bzg);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        aj.b();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            aj.a();
            return;

        case -2: 
            aj.b();
            return;
        }
    }
}
