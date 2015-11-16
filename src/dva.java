// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class dva extends bnk
{

    final duz a;

    dva(duz duz1)
    {
        a = duz1;
        super();
    }

    public void a(int i)
    {
        a.a.post(new dvb(this));
    }
}
