// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RemoteRenderer;

final class gew
    implements Runnable
{

    final int a;
    final gev b;

    gew(gev gev1, int i)
    {
        b = gev1;
        a = i;
        super();
    }

    public void run()
    {
        if (!b.c)
        {
            if (b.a != null)
            {
                b.a.a(a);
            }
            b.c = true;
            b.o.b();
        }
    }
}
