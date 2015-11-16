// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fsb;

public class RecordConsentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fsb();
    public final int a;
    private final Account b;
    private final Scope c[];
    private final String d;

    public RecordConsentRequest(int i, Account account, Scope ascope[], String s)
    {
        a = i;
        b = account;
        c = ascope;
        d = s;
    }

    public Account a()
    {
        return b;
    }

    public Scope[] b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fsb.a(this, parcel, i);
    }

}
