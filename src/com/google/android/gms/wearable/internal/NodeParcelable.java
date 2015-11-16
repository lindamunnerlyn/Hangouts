// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fxs;
import g;
import gap;

public class NodeParcelable
    implements SafeParcelable, gap
{

    public static final android.os.Parcelable.Creator CREATOR = new fxs();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;

    public NodeParcelable(int i, String s, String s1, int j, boolean flag)
    {
        a = i;
        b = s;
        c = s1;
        d = j;
        e = flag;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof NodeParcelable))
        {
            return false;
        } else
        {
            return ((NodeParcelable)obj).b.equals(b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Node{")).append(c).append(", id=").append(b).append(", hops=").append(d).append(", isNearby=").append(e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b());
        g.a(parcel, 3, c());
        g.b(parcel, 4, d());
        g.a(parcel, 5, e());
        g.q(parcel, i);
    }

}
