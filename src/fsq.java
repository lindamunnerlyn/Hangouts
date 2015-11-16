// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class fsq
    implements foz
{

    private final Status a;
    private final ftp b;

    public fsq(Status status, ftp ftp)
    {
        a = status;
        b = ftp;
    }

    public Status D_()
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

    public ftp c()
    {
        return b;
    }
}
