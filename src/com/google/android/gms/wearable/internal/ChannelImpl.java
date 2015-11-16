// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import fyp;
import g;

public class ChannelImpl
    implements SafeParcelable, Channel
{

    public static final android.os.Parcelable.Creator CREATOR = new fyp();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    public ChannelImpl(int i, String s, String s1, String s2)
    {
        a = i;
        b = (String)g.d(s);
        c = (String)g.d(s1);
        d = (String)g.d(s2);
    }

    public String a()
    {
        return c;
    }

    public String b()
    {
        return d;
    }

    public String c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ChannelImpl))
            {
                return false;
            }
            obj = (ChannelImpl)obj;
            if (!b.equals(((ChannelImpl) (obj)).b) || !g.a(((ChannelImpl) (obj)).c, c) || !g.a(((ChannelImpl) (obj)).d, d) || ((ChannelImpl) (obj)).a != a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("ChannelImpl{versionCode=")).append(a).append(", token='").append(b).append('\'').append(", nodeId='").append(c).append('\'').append(", path='").append(d).append('\'').append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, c());
        g.a(parcel, 3, a());
        g.a(parcel, 4, b());
        g.q(parcel, i);
    }

}
