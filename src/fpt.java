// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class fpt
    implements fmd
{

    private final Status a;
    private final fqv b;

    public fpt(Status status, fqv fqv)
    {
        a = status;
        b = fqv;
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

    public fqv c()
    {
        return b;
    }
}
