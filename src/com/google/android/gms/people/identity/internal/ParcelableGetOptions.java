// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import foe;
import g;

public final class ParcelableGetOptions
    implements SafeParcelable
{

    public static final foe CREATOR = new foe();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final Bundle e;
    private final int f;

    public ParcelableGetOptions(int i, boolean flag, boolean flag1, boolean flag2, String s, Bundle bundle)
    {
        f = i;
        a = flag;
        b = flag1;
        c = s;
        d = flag2;
        s = bundle;
        if (bundle == null)
        {
            s = new Bundle();
        }
        e = s;
    }

    public int a()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return g.c(this).a("useOfflineDatabase", Boolean.valueOf(a)).a("useWebData", Boolean.valueOf(b)).a("endpoint", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        foe.a(this, parcel);
    }

}
