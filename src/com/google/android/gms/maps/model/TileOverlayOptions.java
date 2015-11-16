// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fmw;
import fmx;
import fnw;
import fny;
import fon;
import g;

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final fon CREATOR = new fon();
    private final int a;
    private fnw b;
    private fmx c;
    private boolean d;
    private float e;
    private boolean f;

    public TileOverlayOptions()
    {
        d = true;
        f = true;
        a = 1;
    }

    public TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f1, boolean flag1)
    {
        Object obj = null;
        super();
        d = true;
        f = true;
        a = i;
        if (ibinder == null)
        {
            ibinder = null;
        } else
        {
            android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if (iinterface != null && (iinterface instanceof fnw))
            {
                ibinder = (fnw)iinterface;
            } else
            {
                ibinder = new fny(ibinder);
            }
        }
        b = ibinder;
        if (b == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = new fmw(this);
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    private int a()
    {
        return a;
    }

    public static fnw a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    private IBinder b()
    {
        return b.asBinder();
    }

    private float c()
    {
        return e;
    }

    private boolean d()
    {
        return d;
    }

    private boolean e()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, b());
        g.a(parcel, 3, d());
        g.a(parcel, 4, c());
        g.a(parcel, 5, e());
        g.q(parcel, i);
    }

}
