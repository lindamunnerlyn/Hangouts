// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fef;
import g;

public final class OverflowMenuItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fef();
    final int a;
    final int b;
    final String c;
    final Intent d;

    public OverflowMenuItem(int i, int j, String s, Intent intent)
    {
        a = i;
        b = j;
        c = s;
        d = intent;
    }

    public OverflowMenuItem(int i, String s, Intent intent)
    {
        this(1, i, s, intent);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, b);
        g.a(parcel, 3, c);
        g.a(parcel, 4, d, i);
        g.q(parcel, j);
    }

}
