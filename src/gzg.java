// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.StringWriter;

final class gzg
    implements Runnable
{

    final gzf a;

    gzg(gzf gzf1)
    {
        a = gzf1;
        super();
    }

    public void run()
    {
        String s = String.valueOf(a.c);
        (new StringBuilder(String.valueOf(s).length() + 36)).append("Out of memory while decoding image: ").append(s);
        if (a.a instanceof gxm)
        {
            StringWriter stringwriter = new StringWriter();
            ((gxm)a.a).a(new PrintWriter(stringwriter));
            g.a(4, "ImageResource", stringwriter.toString());
        }
    }
}
