// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fvg;
import fwj;
import g;

public class DataItemAssetParcelable
    implements SafeParcelable, fvg
{

    public static final android.os.Parcelable.Creator CREATOR = new fwj();
    final int a;
    private final String b;
    private final String c;

    public DataItemAssetParcelable(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public DataItemAssetParcelable(fvg fvg1)
    {
        a = 1;
        b = (String)g.d(fvg1.a());
        c = (String)g.d(fvg1.b());
    }

    public boolean C_()
    {
        return true;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public fvg c()
    {
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public Object f()
    {
        return c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (b == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(b);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(c);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, a());
        g.a(parcel, 3, b());
        g.q(parcel, i);
    }

}
