// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eml;
import epq;
import epv;
import g;

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epv();
    final int a;
    final IBinder b;
    private final int c;
    private final Scope d[];
    private final Bundle e;
    private final String f;

    public ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        a = i;
        c = j;
        b = ibinder;
        d = ascope;
        e = bundle;
        f = s;
    }

    public ValidateAccountRequest(epq epq1, Scope ascope[], String s, Bundle bundle)
    {
        int i = eml.a;
        if (epq1 == null)
        {
            epq1 = null;
        } else
        {
            epq1 = epq1.asBinder();
        }
        this(1, i, ((IBinder) (epq1)), ascope, null, s);
    }

    public int a()
    {
        return c;
    }

    public Scope[] b()
    {
        return d;
    }

    public String c()
    {
        return f;
    }

    public Bundle d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, a());
        g.a(parcel, 3, b);
        g.a(parcel, 4, b(), i);
        g.a(parcel, 5, d());
        g.a(parcel, 6, c());
        g.q(parcel, j);
    }

}
