// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fbh;

public final class OverflowMenuItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fbh();
    public final int a;
    public final int b;
    public final String c;
    public final Intent d;

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
        fbh.a(this, parcel, i);
    }

}
