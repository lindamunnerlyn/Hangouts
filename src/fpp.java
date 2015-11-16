// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fpp
    implements flz
{

    private final Status a;
    private final fqp b;

    public fpp(Status status, fqp fqp)
    {
        a = status;
        b = fqp;
    }

    public Status B_()
    {
        return a;
    }

    public void b()
    {
        if (b != null)
        {
            b.b();
        }
    }

    public fqp c()
    {
        return b;
    }
}
