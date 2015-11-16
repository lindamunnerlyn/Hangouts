// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ejk;
import emq;
import emv;

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new emv();
    public final int a;
    public final IBinder b;
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

    public ValidateAccountRequest(emq emq1, Scope ascope[], String s, Bundle bundle)
    {
        int i = ejk.a;
        if (emq1 == null)
        {
            emq1 = null;
        } else
        {
            emq1 = emq1.asBinder();
        }
        this(1, i, ((IBinder) (emq1)), ascope, null, s);
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
        emv.a(this, parcel, i);
    }

}
