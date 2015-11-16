// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import flq;

public final class Tile
    implements SafeParcelable
{

    public static final flq CREATOR = new flq();
    public final int a;
    public final int b;
    public final byte c[];
    private final int d;

    public Tile()
    {
        this(1, -1, -1, null);
    }

    public Tile(int i, int j, int k, byte abyte0[])
    {
        d = i;
        a = j;
        b = k;
        c = abyte0;
    }

    public int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        flq.a(this, parcel);
    }

}
