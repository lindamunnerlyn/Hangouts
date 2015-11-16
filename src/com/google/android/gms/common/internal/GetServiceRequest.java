// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eml;
import epq;
import epr;
import ept;
import epz;
import g;
import java.util.Collection;

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new epz();
    final int a;
    final int b;
    int c;
    String d;
    IBinder e;
    Scope f[];
    Bundle g;
    Account h;

    public GetServiceRequest(int i)
    {
        a = 2;
        c = eml.a;
        b = i;
    }

    public GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        a = i;
        b = j;
        c = k;
        d = s;
        if (i < 2)
        {
            s = null;
            if (ibinder != null)
            {
                s = ept.a(epr.a(ibinder));
            }
            h = s;
        } else
        {
            e = ibinder;
            h = account;
        }
        f = ascope;
        g = bundle;
    }

    public GetServiceRequest a(Account account)
    {
        h = account;
        return this;
    }

    public GetServiceRequest a(Bundle bundle)
    {
        g = bundle;
        return this;
    }

    public GetServiceRequest a(epq epq1)
    {
        if (epq1 != null)
        {
            e = epq1.asBinder();
        }
        return this;
    }

    public GetServiceRequest a(String s)
    {
        d = s;
        return this;
    }

    public GetServiceRequest a(Collection collection)
    {
        f = (Scope[])collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.b(parcel, 2, b);
        g.b(parcel, 3, c);
        g.a(parcel, 4, d);
        g.a(parcel, 5, e);
        g.a(parcel, 6, f, i);
        g.a(parcel, 7, g);
        g.a(parcel, 8, h, i);
        g.q(parcel, j);
    }

}
