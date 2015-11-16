// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

public final class fsk
    implements fov
{

    private final Status a;
    private final fti b;

    public fsk(Status status, fti fti)
    {
        a = status;
        b = fti;
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

    public fti c()
    {
        return b;
    }
}
