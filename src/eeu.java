// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class eeu
    implements android.view.Choreographer.FrameCallback
{

    final eet a;

    eeu(eet eet1)
    {
        a = eet1;
        super();
    }

    public void doFrame(long l)
    {
        l = TimeUnit.NANOSECONDS.toSeconds(l);
        if (l != eet.a(a))
        {
            if (eet.a(a) != 0L)
            {
                String s = eet.b(a);
                int i = eet.c(a);
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 16)).append(s).append(" FPS ").append(i).toString());
            }
            eet.d(a);
            eet.a(a, l);
        }
        eet.e(a);
        eet.f(a);
    }
}
