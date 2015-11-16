// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eri;
import g;

public class FavaDiagnosticsEntity
    implements SafeParcelable
{

    public static final eri CREATOR = new eri();
    final int a;
    public final String b;
    public final int c;

    public FavaDiagnosticsEntity(int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.b(parcel, 3, c);
        g.q(parcel, i);
    }

}
