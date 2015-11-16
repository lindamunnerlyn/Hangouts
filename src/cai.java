// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.os.Bundle;

public final class cai extends hla
{

    private caj aj;

    public cai()
    {
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (caj)al.a(caj);
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
