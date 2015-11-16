// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

final class dg
    implements dk
{

    final String a;
    final int b;
    final String c;
    final Notification d;

    public dg(String s, int i, String s1, Notification notification)
    {
        a = s;
        b = i;
        c = s1;
        d = notification;
    }

    public void a(bn bn1)
    {
        bn1.a(a, b, c, d);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
        stringbuilder.append("packageName:").append(a);
        stringbuilder.append(", id:").append(b);
        stringbuilder.append(", tag:").append(c);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
