// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class fso
    implements fox
{

    private final Status a;
    private final ftm b;

    public fso(Status status, ftm ftm)
    {
        a = status;
        b = ftm;
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

    public ftm c()
    {
        return b;
    }
}
