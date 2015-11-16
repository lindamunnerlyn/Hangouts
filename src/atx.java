// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class atx extends ato
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aty();
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;

    public atx()
    {
    }

    atx(Parcel parcel)
    {
        super.b(parcel);
        e = parcel.readInt();
        f = parcel.readInt();
        g = parcel.readInt();
        h = parcel.readInt();
        i = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        super.a(parcel);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
        parcel.writeInt(h);
        parcel.writeLong(i);
    }

}
