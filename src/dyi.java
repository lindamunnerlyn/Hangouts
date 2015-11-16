// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class dyi extends bns
{

    final dyh a;

    dyi(dyh dyh1)
    {
        a = dyh1;
        super();
    }

    public void a(int i)
    {
        a.a.post(new dyj(this));
    }
}
