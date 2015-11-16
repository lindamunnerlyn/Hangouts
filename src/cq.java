// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;

class cq extends cp
{

    cq()
    {
    }

    public Notification a(cf cf1)
    {
        da da1 = new da(cf1.a, cf1.B, cf1.b, cf1.c, cf1.h, cf1.f, cf1.i, cf1.d, cf1.e, cf1.g, cf1.o, cf1.p, cf1.q, cf1.k, cf1.l, cf1.j, cf1.n, cf1.v, cf1.C, cf1.x, cf1.r, cf1.s, cf1.t);
        ca.a(da1, cf1.u);
        ca.a(da1, cf1.m);
        return da1.b();
    }

    public Bundle a(Notification notification)
    {
        return notification.extras;
    }
}
