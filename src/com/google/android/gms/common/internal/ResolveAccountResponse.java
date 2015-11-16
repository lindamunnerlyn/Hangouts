// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import emq;
import emr;
import eoh;

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eoh();
    public final int a;
    public IBinder b;
    private ConnectionResult c;
    private boolean d;
    private boolean e;

    public ResolveAccountResponse()
    {
        this(new ConnectionResult(8, null));
    }

    public ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        a = i;
        b = ibinder;
        c = connectionresult;
        d = flag;
        e = flag1;
    }

    private ResolveAccountResponse(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public emq a()
    {
        return emr.a(b);
    }

    public ConnectionResult b()
    {
        return c;
    }

    public boolean c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ResolveAccountResponse))
            {
                return false;
            }
            obj = (ResolveAccountResponse)obj;
            if (!c.equals(((ResolveAccountResponse) (obj)).c) || !a().equals(((ResolveAccountResponse) (obj)).a()))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        eoh.a(this, parcel, i);
    }

}
