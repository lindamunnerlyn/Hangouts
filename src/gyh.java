// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class gyh
    implements Callable
{

    final gyi a;
    final gyf b;

    gyh(gyf gyf, gyi gyi1)
    {
        b = gyf;
        a = gyi1;
        super();
    }

    public Object call()
    {
        a.b();
        return null;
    }
}
