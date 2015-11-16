// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class ya
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new yb();
    int a;
    int b;
    boolean c;

    public ya()
    {
    }

    ya(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readInt();
        b = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
    }

    public ya(ya ya1)
    {
        a = ya1.a;
        b = ya1.b;
        c = ya1.c;
    }

    boolean a()
    {
        return a >= 0;
    }

    void b()
    {
        a = -1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
