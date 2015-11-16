// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.StringWriter;

final class guv
    implements Runnable
{

    final guu a;

    guv(guu guu1)
    {
        a = guu1;
        super();
    }

    public void run()
    {
        String s = String.valueOf(guu.a(a));
        (new StringBuilder(String.valueOf(s).length() + 36)).append("Out of memory while decoding image: ").append(s);
        if (a.a instanceof gta)
        {
            guw guw1 = new guw(this, new StringWriter());
            ((gta)a.a).a(guw1);
            g.a(4, "ImageResource", guw1.toString());
        }
    }
}
