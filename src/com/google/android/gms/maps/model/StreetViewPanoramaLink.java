// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import erf;
import foj;
import g;
import java.util.Arrays;

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    public static final foj CREATOR = new foj();
    public final String a;
    public final float b;
    private final int c;

    public StreetViewPanoramaLink(int i, String s, float f)
    {
        c = i;
        a = s;
        float f1 = f;
        if ((double)f <= 0.0D)
        {
            f1 = f % 360F + 360F;
        }
        b = f1 % 360F;
    }

    int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLink))
            {
                return false;
            }
            obj = (StreetViewPanoramaLink)obj;
            if (!a.equals(((StreetViewPanoramaLink) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Float.valueOf(b)
        });
    }

    public String toString()
    {
        return g.c(this).a("panoId", a).a("bearing", Float.valueOf(b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a());
        g.a(parcel, 2, a);
        g.a(parcel, 3, b);
        g.q(parcel, i);
    }

}
