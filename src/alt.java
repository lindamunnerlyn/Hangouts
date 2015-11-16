// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

public final class alt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new alu();
    private static final AtomicInteger a = new AtomicInteger(1);
    private static final String b;
    private final String c;
    private final String d;
    private final int e;

    alt(Parcel parcel)
    {
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readInt();
    }

    public alt(String s)
    {
        n.b(s);
        c = s;
        e = a.incrementAndGet();
        s = b;
        int i = e;
        d = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    public int a()
    {
        return e;
    }

    public String b()
    {
        boolean flag;
        if (!TextUtils.isEmpty(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return c;
        } else
        {
            return toString();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        alt alt1 = (alt)obj;
        if (alt1 != null)
        {
            return alt1.c.equals(c) && alt1.d.equals(d);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        return c.hashCode() + e * 31;
    }

    public String toString()
    {
        String s = c;
        String s1 = d;
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("_").append(s1).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(e);
    }

    static 
    {
        long l = SystemClock.elapsedRealtime();
        b = (new StringBuilder(21)).append(l).append("_").toString();
    }
}
