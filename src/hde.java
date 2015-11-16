// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class hde
    implements Callable
{

    final hig a;
    final hdd b;

    hde(hdd hdd1, hig hig)
    {
        b = hdd1;
        a = hig;
        super();
    }

    public Object call()
    {
        hda.b(b.a).a(a);
        java.io.IOException ioexception = hda.a(a);
        if (ioexception != null)
        {
            b.a(ioexception);
        }
        return null;
    }
}
