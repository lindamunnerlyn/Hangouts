// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class hef
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new heg();
    private final long a;
    private final String b;

    hef(Parcel parcel)
    {
        b = parcel.readString();
        a = parcel.readLong();
    }

    public hef(String s, long l)
    {
        b = s;
        a = l;
    }

    public long a()
    {
        return a;
    }

    public boolean b()
    {
        return a != 0L;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof hef)
        {
            obj = (hef)obj;
            flag = flag1;
            if (a == ((hef) (obj)).a)
            {
                flag = flag1;
                if (TextUtils.equals(b, ((hef) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int j = (int)(a ^ a >>> 32);
        int i = j;
        if (b != null)
        {
            i = j ^ b.hashCode();
        }
        return i;
    }

    public String toString()
    {
        String s = b;
        long l = a;
        return (new StringBuilder(String.valueOf(s).length() + 26)).append("g-").append(s).append(", p-").append(l).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeLong(a);
    }

}
