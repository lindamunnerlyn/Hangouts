// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ekg;
import elu;
import eof;
import g;
import java.util.Arrays;
import n;

public final class Status
    implements SafeParcelable, ekg
{

    public static final android.os.Parcelable.Creator CREATOR = new elu();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private final int f;
    private final int g;
    private final String h;
    private final PendingIntent i;

    public Status(int j)
    {
        this(j, null);
    }

    public Status(int j, int k, String s, PendingIntent pendingintent)
    {
        f = j;
        g = k;
        h = s;
        i = pendingintent;
    }

    public Status(int j, String s)
    {
        this(1, j, s, null);
    }

    public Status(int j, String s, PendingIntent pendingintent)
    {
        this(1, j, s, pendingintent);
    }

    public Status B_()
    {
        return this;
    }

    public PendingIntent b()
    {
        return i;
    }

    public String c()
    {
        return h;
    }

    public int d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return g <= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Status)
        {
            if (f == ((Status) (obj = (Status)obj)).f && g == ((Status) (obj)).g && g.a(h, ((Status) (obj)).h) && g.a(i, ((Status) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public int f()
    {
        return g;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(f), Integer.valueOf(g), h, i
        });
    }

    public String toString()
    {
        eof eof1 = g.c(this);
        String s;
        if (h != null)
        {
            s = h;
        } else
        {
            s = n.a(g);
        }
        return eof1.a("statusCode", s).a("resolution", i).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        elu.a(this, parcel, j);
    }

}
