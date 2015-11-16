// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fqv;
import g;

public final class AccountToken
    implements SafeParcelable
{

    public static final fqv CREATOR = new fqv();
    private final int a;
    private final String b;
    private final String c;

    public AccountToken(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    private int a()
    {
        return a;
    }

    private String b()
    {
        return b;
    }

    private String c()
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
        g.a(parcel, 1, b());
        g.b(parcel, 1000, a());
        g.a(parcel, 2, c());
        g.q(parcel, i);
    }

}
