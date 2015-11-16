// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cah extends hla
{

    private hbi aj;

    public cah()
    {
    }

    static void a(Context context, ap ap, int i, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", context.getString(i));
        bundle.putString("message", context.getString(j));
        bundle.putString("positive", context.getString(l.hi));
        bundle.putString("negative", context.getString(l.hj));
        context = new cah();
        context.setArguments(bundle);
        context.a(ap, "error");
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (hbi)al.a(hbi);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        aj.c();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            aj.b();
            return;

        case -2: 
            aj.c();
            return;
        }
    }
}
