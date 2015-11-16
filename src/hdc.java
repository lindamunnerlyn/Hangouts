// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class hdc
    implements Callable
{

    final hdd a;
    final hda b;

    hdc(hda hda, hdd hdd1)
    {
        b = hda;
        a = hdd1;
        super();
    }

    public Object call()
    {
        a.b();
        return null;
    }
}
