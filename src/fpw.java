// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class fpw
    implements fmb
{

    private final Status a;
    private final fqr b;

    public fpw(Status status, fqr fqr)
    {
        a = status;
        b = fqr;
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

    public fqr c()
    {
        return b;
    }
}
