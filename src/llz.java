// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.base.library_loader.LegacyLinker;

public final class llz
    implements Runnable
{

    final long a;

    public llz(long l)
    {
        a = l;
        super();
    }

    public void run()
    {
        LegacyLinker.a(a);
    }
}
