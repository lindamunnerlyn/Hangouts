// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ffo;
import g;

public final class AccountData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ffo();
    private final int a;
    private final String b;
    private final String c;

    public AccountData(int i, String s, String s1)
    {
        g.a(s, "Account name must not be empty.");
        a = i;
        b = s;
        c = s1;
    }

    private int c()
    {
        return a;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.a(parcel, 1, a());
        g.b(parcel, 1000, c());
        g.a(parcel, 2, b());
        g.q(parcel, i);
    }

}
