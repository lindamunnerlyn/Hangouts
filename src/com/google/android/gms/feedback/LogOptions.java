// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fam;

public class LogOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fam();
    public final int a;
    public String b;
    public boolean c;

    public LogOptions(int i, String s, boolean flag)
    {
        a = i;
        b = s;
        c = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fam.a(this, parcel);
    }

}
