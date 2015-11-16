// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fnz;

public final class AccountToken
    implements SafeParcelable
{

    public static final fnz CREATOR = new fnz();
    private final int a;
    private final String b;
    private final String c;

    public AccountToken(int i, String s, String s1)
    {
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
        fnz.a(this, parcel);
    }

}
