// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import iuk;
import jnt;
import n;

public class b
{

    private final int a;
    private final int b;

    public iuk a()
    {
        iuk iuk1 = new iuk();
        iuk1.a = Integer.valueOf(a);
        iuk1.b = Integer.valueOf(b);
        return iuk1;
    }

    public String toString()
    {
        return n.a(this).a("rtt", a).a("error", b).toString();
    }

    public (int i, int j)
    {
        a = i;
        b = j;
    }
}
