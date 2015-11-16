// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fxi;
import fxj;
import fxr;
import fyi;
import g;

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fxr();
    final int a;
    public final fxi b;
    public final IntentFilter c[];
    public final String d;
    public final String e;

    public AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        a = i;
        if (ibinder != null)
        {
            b = fxj.a(ibinder);
        } else
        {
            b = null;
        }
        c = aintentfilter;
        d = s;
        e = s1;
    }

    public AddListenerRequest(fyi fyi1)
    {
        a = 1;
        b = fyi1;
        c = fyi1.b();
        d = fyi1.c();
        e = fyi1.d();
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
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, a());
        g.a(parcel, 3, c, i);
        g.a(parcel, 4, d);
        g.a(parcel, 5, e);
        g.q(parcel, j);
    }

}
