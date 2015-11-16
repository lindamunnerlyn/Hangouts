// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fwg;
import fyb;

public class AncsNotificationParcelable
    implements SafeParcelable, fyb
{

    public static final android.os.Parcelable.Creator CREATOR = new fwg();
    public final int a;
    private int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private String h;
    private byte i;
    private byte j;
    private byte k;
    private byte l;

    public AncsNotificationParcelable(int i1, int j1, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        b = j1;
        a = i1;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = byte0;
        j = byte1;
        k = byte2;
        l = byte3;
    }

    public int b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AncsNotificationParcelable)obj;
            if (l != ((AncsNotificationParcelable) (obj)).l)
            {
                return false;
            }
            if (k != ((AncsNotificationParcelable) (obj)).k)
            {
                return false;
            }
            if (j != ((AncsNotificationParcelable) (obj)).j)
            {
                return false;
            }
            if (i != ((AncsNotificationParcelable) (obj)).i)
            {
                return false;
            }
            if (b != ((AncsNotificationParcelable) (obj)).b)
            {
                return false;
            }
            if (a != ((AncsNotificationParcelable) (obj)).a)
            {
                return false;
            }
            if (!c.equals(((AncsNotificationParcelable) (obj)).c))
            {
                return false;
            }
            if (d == null ? ((AncsNotificationParcelable) (obj)).d != null : !d.equals(((AncsNotificationParcelable) (obj)).d))
            {
                return false;
            }
            if (!h.equals(((AncsNotificationParcelable) (obj)).h))
            {
                return false;
            }
            if (!e.equals(((AncsNotificationParcelable) (obj)).e))
            {
                return false;
            }
            if (!g.equals(((AncsNotificationParcelable) (obj)).g))
            {
                return false;
            }
            if (!f.equals(((AncsNotificationParcelable) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        if (h == null)
        {
            return c;
        } else
        {
            return h;
        }
    }

    public int hashCode()
    {
        int j1 = a;
        int k1 = b;
        int l1 = c.hashCode();
        int i1;
        if (d != null)
        {
            i1 = d.hashCode();
        } else
        {
            i1 = 0;
        }
        return ((((((((i1 + ((j1 * 31 + k1) * 31 + l1) * 31) * 31 + e.hashCode()) * 31 + f.hashCode()) * 31 + g.hashCode()) * 31 + h.hashCode()) * 31 + i) * 31 + j) * 31 + k) * 31 + l;
    }

    public byte i()
    {
        return i;
    }

    public byte j()
    {
        return j;
    }

    public byte k()
    {
        return k;
    }

    public byte l()
    {
        return l;
    }

    public String toString()
    {
        return (new StringBuilder("AncsNotificationParcelable{mVersionCode=")).append(a).append(", mId=").append(b).append(", mAppId='").append(c).append('\'').append(", mDateTime='").append(d).append('\'').append(", mNotificationText='").append(e).append('\'').append(", mTitle='").append(f).append('\'').append(", mSubtitle='").append(g).append('\'').append(", mDisplayName='").append(h).append('\'').append(", mEventId=").append(i).append(", mEventFlags=").append(j).append(", mCategoryId=").append(k).append(", mCategoryCount=").append(l).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        fwg.a(this, parcel);
    }

}
