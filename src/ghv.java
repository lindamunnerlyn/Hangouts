// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RemoteRenderer;

final class ghv
    implements Runnable
{

    final int a;
    final ghu b;

    ghv(ghu ghu1, int i)
    {
        b = ghu1;
        a = i;
        super();
    }

    public void run()
    {
        b.v = false;
        b.r.f();
        b.c = a;
        b.n();
        b.b.a(b.c);
    }
}
