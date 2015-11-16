// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

final class fvx
    implements Runnable
{

    final DataHolder a;
    final fvw b;

    fvx(fvw fvw1, DataHolder dataholder)
    {
        b = fvw1;
        a = dataholder;
        super();
    }

    public void run()
    {
        fve fve1 = new fve(a);
        b.b.a(fve1);
        fve1.b();
        return;
        Exception exception;
        exception;
        fve1.b();
        throw exception;
    }
}
