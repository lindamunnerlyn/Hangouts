// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import erf;
import fim;
import g;
import java.util.Arrays;
import java.util.List;

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final fim CREATOR = new fim();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!g.a(b, ((PlaceLocalization) (obj)).b) || !g.a(c, ((PlaceLocalization) (obj)).c) || !g.a(d, ((PlaceLocalization) (obj)).d) || !g.a(e, ((PlaceLocalization) (obj)).e) || !g.a(f, ((PlaceLocalization) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e
        });
    }

    public String toString()
    {
        return g.c(this).a("name", b).a("address", c).a("internationalPhoneNumber", d).a("regularOpenHours", e).a("attributions", f).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.a(parcel, 1, b);
        g.b(parcel, 1000, a);
        g.a(parcel, 2, c);
        g.a(parcel, 3, d);
        g.a(parcel, 4, e);
        g.b(parcel, 5, f);
        g.q(parcel, i);
    }

}
