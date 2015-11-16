// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fvm;
import fyb;

public class NodeParcelable
    implements SafeParcelable, fyb
{

    public static final android.os.Parcelable.Creator CREATOR = new fvm();
    public final int a;
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
        fvm.a(this, parcel);
    }

}
