// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import erj;
import g;

public final class ConnectionEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new erj();
    final int a;
    private final long b;
    private int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final long j;
    private final long k;
    private long l;

    public ConnectionEvent(int i1, long l1, int j1, String s, String s1, String s2, 
            String s3, String s4, String s5, long l2, long l3)
    {
        a = i1;
        b = l1;
        c = j1;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        l = -1L;
        h = s4;
        i = s5;
        j = l2;
        k = l3;
    }

    public ConnectionEvent(long l1, int i1, String s, String s1, String s2, String s3, 
            String s4, String s5, long l2, long l3)
    {
        this(1, l1, i1, s, s1, s2, s3, s4, s5, l2, l3);
    }

    private long a()
    {
        return b;
    }

    private int b()
    {
        return c;
    }

    private String c()
    {
        return d;
    }

    private String d()
    {
        return e;
    }

    private String e()
    {
        return f;
    }

    private String f()
    {
        return g;
    }

    private String g()
    {
        return h;
    }

    private String h()
    {
        return i;
    }

    private long i()
    {
        return k;
    }

    private long j()
    {
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        i1 = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, a());
        g.a(parcel, 4, c());
        g.a(parcel, 5, d());
        g.a(parcel, 6, e());
        g.a(parcel, 7, f());
        g.a(parcel, 8, g());
        g.a(parcel, 10, j());
        g.a(parcel, 11, i());
        g.b(parcel, 12, b());
        g.a(parcel, 13, h());
        g.q(parcel, i1);
    }

}
