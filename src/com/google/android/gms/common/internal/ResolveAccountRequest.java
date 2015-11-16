// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import erg;
import g;

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new erg();
    final int a;
    private final Account b;
    private final int c;

    public ResolveAccountRequest(int i, Account account, int j)
    {
        a = i;
        b = account;
        c = j;
    }

    public ResolveAccountRequest(Account account, int i)
    {
        this(1, account, i);
    }

    public Account a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, a(), i);
        g.b(parcel, 3, b());
        g.q(parcel, j);
    }

}
