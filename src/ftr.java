// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

final class ftr
    implements Runnable
{

    final DataHolder a;
    final ftq b;

    ftr(ftq ftq1, DataHolder dataholder)
    {
        b = ftq1;
        a = dataholder;
        super();
    }

    public void run()
    {
        fsy fsy1 = new fsy(a);
        b.b.a(fsy1);
        fsy1.b();
        return;
        Exception exception;
        exception;
        fsy1.b();
        throw exception;
    }
}
