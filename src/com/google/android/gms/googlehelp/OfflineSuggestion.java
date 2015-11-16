// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fbq;

public final class OfflineSuggestion
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fbq();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public OfflineSuggestion(int i, String s, String s1, String s2, String s3)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fbq.a(this, parcel);
    }

}
