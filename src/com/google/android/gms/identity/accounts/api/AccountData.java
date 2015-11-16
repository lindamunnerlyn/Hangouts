// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fcq;
import h;

public final class AccountData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fcq();
    private final int a;
    private final String b;
    private final String c;

    public AccountData(int i, String s, String s1)
    {
        h.a(s, "Account name must not be empty.");
        a = i;
        b = s;
        c = s1;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fcq.a(this, parcel);
    }

}
