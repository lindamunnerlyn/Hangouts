// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fxi;
import fxj;
import fxw;
import g;

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fxw();
    final int a;
    public final fxi b;

    public RemoveListenerRequest(int i, IBinder ibinder)
    {
        a = i;
        if (ibinder != null)
        {
            b = fxj.a(ibinder);
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public RemoveListenerRequest(fxi fxi1)
    {
        a = 1;
        b = fxi1;
    }

    IBinder a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.asBinder();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, a());
        g.q(parcel, i);
    }

}
