// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class gyj
    implements Callable
{

    final hdp a;
    final gyi b;

    gyj(gyi gyi1, hdp hdp)
    {
        b = gyi1;
        a = hdp;
        super();
    }

    public Object call()
    {
        gyf.b(b.a).a(a);
        java.io.IOException ioexception = gyf.a(a);
        if (ioexception != null)
        {
            b.a(ioexception);
        }
        return null;
    }
}
