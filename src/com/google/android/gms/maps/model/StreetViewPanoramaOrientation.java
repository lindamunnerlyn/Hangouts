// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import flp;
import g;
import h;
import java.util.Arrays;

public class StreetViewPanoramaOrientation
    implements SafeParcelable
{

    public static final flp CREATOR = new flp();
    public final float a;
    public final float b;
    private final int c;

    public StreetViewPanoramaOrientation(float f, float f1)
    {
        this(1, f, f1);
    }

    public StreetViewPanoramaOrientation(int i, float f, float f1)
    {
        boolean flag;
        if (-90F <= f && f <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag, "Tilt needs to be between -90 and 90 inclusive");
        c = i;
        a = 0.0F + f;
        f = f1;
        if ((double)f1 <= 0.0D)
        {
            f = f1 % 360F + 360F;
        }
        b = f % 360F;
    }

    public int a()
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
            if (!(obj instanceof StreetViewPanoramaOrientation))
            {
                return false;
            }
            obj = (StreetViewPanoramaOrientation)obj;
            if (Float.floatToIntBits(a) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Float.valueOf(a), Float.valueOf(b)
        });
    }

    public String toString()
    {
        return g.c(this).a("tilt", Float.valueOf(a)).a("bearing", Float.valueOf(b)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        flp.a(this, parcel);
    }

}
