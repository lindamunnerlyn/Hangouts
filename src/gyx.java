// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class gyx
    implements Runnable
{

    final gyv a;

    gyx(gyv gyv)
    {
        a = gyv;
        super();
    }

    public void run()
    {
        gyw.b().add(a);
    }
}
