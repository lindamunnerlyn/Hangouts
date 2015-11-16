// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fvc;
import fvd;
import fvl;
import fwd;

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fvl();
    public final int a;
    public final fvc b;
    public final IntentFilter c[];
    public final String d;
    public final String e;

    public AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        a = i;
        if (ibinder != null)
        {
            b = fvd.a(ibinder);
        } else
        {
            b = null;
        }
        c = aintentfilter;
        d = s;
        e = s1;
    }

    public AddListenerRequest(fwd fwd1)
    {
        a = 1;
        b = fwd1;
        c = fwd1.b();
        d = fwd1.c();
        e = fwd1.d();
    }

    public IBinder a()
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
        fvl.a(this, parcel, i);
    }

}
