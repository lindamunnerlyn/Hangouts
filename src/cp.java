// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

class cp extends cj
{

    cp()
    {
    }

    public Notification a(cf cf1)
    {
        cz cz1 = new cz(cf1.a, cf1.B, cf1.b, cf1.c, cf1.h, cf1.f, cf1.i, cf1.d, cf1.e, cf1.g, cf1.o, cf1.p, cf1.q, cf1.l, cf1.j, cf1.n, cf1.v, cf1.x, cf1.r, cf1.s, cf1.t);
        ca.a(cz1, cf1.u);
        ca.a(cz1, cf1.m);
        return cz1.b();
    }

    public Bundle a(Notification notification)
    {
        return cy.a(notification);
    }

    public ArrayList a(cb acb[])
    {
        return cy.a(acb);
    }
}
