// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fka;
import fkb;
import fla;
import flb;
import flr;

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final flr CREATOR = new flr();
    private final int a;
    private fla b;
    private fkb c;
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
        d = true;
        f = true;
        a = i;
        b = flb.a(ibinder);
        if (b == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new fka(this);
        }
        c = ibinder;
        d = flag;
        e = f1;
        f = flag1;
    }

    public static fla a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    public int a()
    {
        return a;
    }

    public IBinder b()
    {
        return b.asBinder();
    }

    public float c()
    {
        return e;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        flr.a(this, parcel);
    }

}
