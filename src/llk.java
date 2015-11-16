// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.base.ApplicationStatus;

public final class llk
    implements Runnable
{

    public llk()
    {
    }

    public void run()
    {
        if (ApplicationStatus.d() != null)
        {
            return;
        } else
        {
            ApplicationStatus.c(new lll(this));
            ApplicationStatus.a(ApplicationStatus.d());
            return;
        }
    }
}
